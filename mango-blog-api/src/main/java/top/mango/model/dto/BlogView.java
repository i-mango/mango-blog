package top.mango.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description: 博客浏览量
 * @Author: Mango
 * @Date: 2023-08-07
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BlogView {
	private Long id;
	private Integer views;
}
