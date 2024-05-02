package tech.msop.core.result.common;

/**
 * IResult 响应码与响应信息
 *
 * @author ruozhuliufeng
 */
public interface IResult {
    /**
     * 获取响应编码
     *
     * @return 响应编码
     */
    String getCode();

    /**
     * 获取响应信息
     *
     * @return 响应信息
     */
    String getMessage();
}
