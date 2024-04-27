package tech.msop.core.log.annotation;

import java.lang.annotation.*;

/**
 * 业务日志注解
 *
 * @author ruozhuliufeng
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BusinessLog {

    /**
     * 解析的实体bean name
     *
     * @return 日志实现服务的Bean
     */
    String beanName() default "";

    /**
     * 和value必须有一个不为空
     *
     * @return 日志实现类
     */
    Class value() default Object.class;
}
