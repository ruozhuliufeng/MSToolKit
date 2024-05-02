package tech.msop.core.result.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 统一返回工具类
 *
 * @author ruozhuliufeng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {
    /**
     * 承载数据
     */
    private T data;
    /**
     * 响应编码
     */
    private String code;
    /**
     * 响应信息
     */
    private String message;
    /**
     * 数据Map
     */
    private Map<String, Object> dataMap;
    /**
     * 成功标识
     */
    private boolean success;


    public Result(CodeEnum codeEnum) {
        this(codeEnum, null, codeEnum.getMessage());
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
        this.success = code.equals(CodeEnum.SUCCESS.getCode());
    }

    public Result(CodeEnum codeEnum, String message) {
        this(codeEnum, null, message);
    }

    public Result(CodeEnum codeEnum, T data) {
        this(codeEnum, data, codeEnum.getMessage());
    }

    public Result(CodeEnum codeEnum, T data, String message) {
        this(data, codeEnum.getCode(), message, new HashMap<>(), codeEnum.equals(CodeEnum.SUCCESS));
    }

    public static <T> Result<T> succeed(String msg) {
        return of(null, CodeEnum.SUCCESS.getCode(), msg, new HashMap<>(), true);
    }

    public static <T> Result<T> succeed(T data, String msg) {
        return of(data, CodeEnum.SUCCESS.getCode(), msg, new HashMap<>(), true);
    }

    public static <T> Result<T> succeed(T data) {
        return of(data, CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(), new HashMap<>(), true);
    }

    public static <T> Result<T> succeed() {
        return succeed("操作成功");
    }

    public static <T> Result<T> succeed(String code, String msg) {
        return new Result<T>(code, msg);
    }

    public static <T> Result<T> succeed(CodeEnum codeEnum) {
        return new Result<>(codeEnum);
    }

    public static <T> Result<T> succeed(CodeEnum codeEnum, String message) {
        return new Result<>(codeEnum, message);
    }

    public static <T> Result<T> succeed(T data, CodeEnum codeEnum) {
        return new Result<>(codeEnum, data);
    }

    public static <T> Result<T> succeed(T data, CodeEnum codeEnum, String message) {
        return new Result<>(codeEnum, data, message);
    }

    public static <T> Result<T> of(T data, String code, String msg, Map<String, Object> dataMap, boolean success) {
        return new Result<>(data, code, msg, dataMap, success);
    }

    public static <T> Result<T> failed(String msg) {
        return of(null, CodeEnum.FAILURE.getCode(), msg, new HashMap<String, Object>(), false);
    }

    public static <T> Result<T> failed(T data, String msg) {
        return of(data, CodeEnum.FAILURE.getCode(), msg, new HashMap<>(), false);
    }

    public static <T> Result<T> failed() {
        return failed("操作失败");
    }

    public static <T> Result<T> failed(String code, String msg) {
        return new Result<T>(code, msg);
    }

    public static <T> Result<T> failed(CodeEnum codeEnum) {
        return new Result<>(codeEnum);
    }

    public static <T> Result<T> failed(CodeEnum codeEnum, String message) {
        return new Result<>(codeEnum, message);
    }

    public static <T> Result<T> failed(T data, CodeEnum codeEnum) {
        return new Result<>(codeEnum, data);
    }

    public static <T> Result<T> failed(T data, CodeEnum codeEnum, String message) {
        return new Result<>(codeEnum, data, message);
    }
}
