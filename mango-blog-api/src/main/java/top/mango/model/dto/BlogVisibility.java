package top.mango.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description: 博客可见性DTO
 * @Author: Mango
 * @Date: 2023-08-07
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BlogVisibility {
	private Boolean appreciation;//赞赏开关
	private Boolean recommend;//推荐开关
	private Boolean commentEnabled;//评论开关
	private Boolean top;//是否置顶
	private Boolean published;//公开或私密
	private String password;//密码保护
}
