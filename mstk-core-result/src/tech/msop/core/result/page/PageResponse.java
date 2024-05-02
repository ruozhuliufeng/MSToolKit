package tech.msop.core.result.page;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tech.msop.core.result.common.BaseEntity;

/**
 * 分页响应数据
 *
 * @author ruozhuliufeng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResponse extends BaseEntity {
    /**
     * 分页总数
     */
    private Long count;
}
