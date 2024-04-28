package tech.msop.core.log.service;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 业务日志服务接口,自定义服务必须实现该接口
 *
 * @author ruozhuliufeng
 */
public interface BusinessLogService {

    /**
     * 处理前的对象保留
     *
     * @param pjp
     * @return
     */
    default Object processBefore(ProceedingJoinPoint pjp) {
        return null;
    }


    /**
     * 设置日志参数，返回日志实体
     *
     * @param pjp              请求参数
     *                         特别说明如果 如果请求参数是 HttpServletRequest HttpServletResponse
     *                         一定要做特殊判断不可直接序列化等（影响流的输入输出的操作）参考样例判断
     *                         if (!(rlt instanceof HttpServletRequest)
     *                         && !(rlt instanceof HttpServletResponse)) {
     *                         }
     * @param rlt              返回参数
     *                         特别说明如果 如果返回参数是 HttpServletRequest HttpServletResponse
     *                         一定要做特殊判断不可直接序列化等（影响流的输入输出的操作）参考样例判断
     *                         Object[] arguments = joinPoint.getArgs();
     *                         if (!ObjectUtils.isEmpty(arguments)) {
     *                         for (Object obj : arguments) {
     *                         if (!(obj instanceof HttpServletRequest)
     *                         && !(obj instanceof HttpServletResponse)) {
     *                         }
     *                         }
     *                         }
     * @param processBeforeObj 处理之前需要保留的对象比如修改前修改后
     * @param cost             耗时
     * @return
     */
    void process(ProceedingJoinPoint pjp, Object rlt, Object processBeforeObj, Long cost);

}
