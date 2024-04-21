package tech.msop.core.tool.node;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.util.Objects;

/**
 * 树型节点类
 *
 * @author ruozhuliufeng
 */
@Data
public class TreeNode extends BaseNode<TreeNode> {

	private static final long serialVersionUID = 1L;

	private String title;

	@JsonSerialize(using = ToStringSerializer.class)
	private Long key;

	@JsonSerialize(using = ToStringSerializer.class)
	private Long value;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		TreeNode other = (TreeNode) obj;
		return Func.equals(this.getId(), other.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, parentId);
	}

}
