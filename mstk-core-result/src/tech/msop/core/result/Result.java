package tech.msop.core.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

/**
 * 统一返回工具类
 *
 * @author ruozhuliufeng
 * @date 2021-08-04
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
}
