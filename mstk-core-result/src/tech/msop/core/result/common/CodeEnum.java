package tech.msop.core.result.common;


/**
 * 常见响应编码与响应信息 <br/>
 * 预定义：<br/>
 * * M00000: 操作类型编码 <br/>
 * * M10000: 操作异常编码 <br/>
 * * M20000: 请求异常编码 <br/>
 * * M30000: 响应异常编码 <br/>
 * * M40000: 认证异常编码 <br/>
 * * M50000: 系统异常编码 <br/>
 * * M60000: 业务异常编码 <br/>
 * @author ruozhuliufeng
 */
public enum CodeEnum implements IResult {
    /**
     * 操作成功
     */
    SUCCESS("M0000", "操作成功"),

    /**
     * 业务异常
     */
    FAILURE("M60000", "业务异常"),

    /**
     * 请求未授权
     */
    UN_AUTHORIZED("M400001", "请求未授权"),

    /**
     * 404 没找到请求
     */
    NOT_FOUND("M40004", "404 没找到请求"),

    /**
     * 消息不能读取
     */
    MSG_NOT_READABLE("M20001", "消息不能读取"),

    /**
     * 不支持当前请求方法
     */
    METHOD_NOT_SUPPORTED("M20002", "不支持当前请求方法"),

    /**
     * 不支持当前媒体类型
     */
    MEDIA_TYPE_NOT_SUPPORTED("M200003", "不支持当前媒体类型"),

    /**
     * 请求被拒绝
     */
    REQ_REJECT("M200004", "请求被拒绝"),

    /**
     * 服务器异常
     */
    INTERNAL_SERVER_ERROR("M500000", "服务器异常"),

    /**
     * 缺少必要的请求参数
     */
    PARAM_MISS("M200005", "缺少必要的请求参数"),

    /**
     * 请求参数类型错误
     */
    PARAM_TYPE_ERROR("M200006", "请求参数类型错误"),

    /**
     * 请求参数绑定错误
     */
    PARAM_BIND_ERROR("M200007", "请求参数绑定错误"),

    /**
     * 参数校验失败
     */
    PARAM_VALID_ERROR("M200008", "参数校验失败"),
    ;

    final String code;
    final String message;

    CodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}


