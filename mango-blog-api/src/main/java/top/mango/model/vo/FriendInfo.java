package top.mango.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description: 友链页面信息
 * @Author: Mango
 * @Date: 2023-08-07
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class FriendInfo {
	private String content;
	private Boolean commentEnabled;
}
