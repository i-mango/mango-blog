package top.mango.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Description: 友链
 * @Author: Mango
 * @Date: 2023-08-07
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Friend {
	private Long id;
	private String nickname;//昵称
	private String description;//描述
	private String website;//站点
	private String avatar;//头像
	private Boolean published;//公开或隐藏
	private Integer views;//浏览次数
	private Date createTime;//创建时间
}
