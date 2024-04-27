package tech.msop.core.log.aspect;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import tech.msop.core.log.annotation.BusinessLog;
import tech.msop.core.log.service.BusinessLogService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 业务日志注解切面
 *
 * @author ruozhuliufeng
 */
@Aspect
@Component
@Slf4j
public class BusinessLogAspect {

    ExecutorService fixedThreadPool = TtlExecutors.getTtlExecutorService(Executors.newFixedThreadPool(10));


    //Service层切点  自定义的注解类路径
    @Pointcut(value = "@annotation(tech.msop.core.log.annotation.BusinessLog)")
    public void pointCut() {
        log.info("BusinessLogAspect");
    }

    @Around(value = "pointCut() && @annotation(businessLog)")
    public Object around(ProceedingJoinPoint joinPoint, BusinessLog businessLog) {
        Long beginTime = System.currentTimeMillis();
        BusinessLogService businessLogService = null;
        Object processBeforeObj = null;
        Object rlt = null;
        Class<BusinessLogService> beanNameClass = businessLog.value();
        try {
            if (StringUtils.hasText(businessLog.beanName())) {
                businessLogService = SpringBeanHelperComponent.getBean(businessLog.beanName(), BusinessLogService.class);
            } else {
                businessLogService = SpringBeanHelperComponent.getBean(beanNameClass);
            }
        } catch (Throwable e) {
            log.error(e.getMessage());
        }
        try{
            //不可以影响正常流程
            if (!ObjectUtils.isEmpty(businessLogService)) {
                processBeforeObj = businessLogService.processBefore(joinPoint);
            }
            //如果不执行这句，会不执行切面的Before方法及controller的业务方法
            rlt = joinPoint.proceed();
            return rlt;
        } catch (Throwable e)
        {
            throw new BusinessException(e.getMessage(),e);
        } finally{
            Long endTime = System.currentTimeMillis();
            Long cost = endTime - beginTime;
            try {
                final Object result = rlt;
                //将业务方法新开线程执行
                Object finalProcessBeforeObj = processBeforeObj;
                //不可以影响正常流程
                if (!ObjectUtils.isEmpty(businessLogService)) {
                    BusinessLogService finalBusinessLogService = businessLogService;
                    fixedThreadPool.execute(() -> {
                        //获取执行的bean
                        finalBusinessLogService.process(joinPoint, result, finalProcessBeforeObj, cost);
                    });
                }
            } catch (Exception e) {
                log.error("日志保存失败", e);
            }
        }
    }
}
