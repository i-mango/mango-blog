package top.mango.enums;

/**
 * 评论开放状态枚举类
 *
 * @author: Mango
 * @date: 2023-08-07
 */
public enum CommentOpenStateEnum {
	/**
	 * 博客不存在，或博客未公开
	 */
	NOT_FOUND,
	/**
	 * 评论正常开放
	 */
	OPEN,
	/**
	 * 评论已关闭
	 */
	CLOSE,
	/**
	 * 评论所在页面需要密码
	 */
	PASSWORD,
}
