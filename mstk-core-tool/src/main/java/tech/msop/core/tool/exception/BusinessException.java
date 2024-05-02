package tech.msop.core.tool.exception;

import lombok.Getter;
import tech.msop.core.result.common.CodeEnum;
import tech.msop.core.result.common.IResult;

/**
 * 业务异常
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 6610083281801529147L;

    @Getter
    private final IResult result;

    public BusinessException(String message) {
        super(message);
        this.result = CodeEnum.FAILURE;
    }

    public BusinessException(IResult result) {
        super(result.getMessage());
        this.result = result;
    }

    public BusinessException(IResult result,Throwable cause){
        super(cause);
        this.result = result;
    }


    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
