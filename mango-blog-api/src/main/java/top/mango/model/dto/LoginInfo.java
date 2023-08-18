package top.mango.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description: 登录账号密码
 * @Author: Mango
 * @Date: 2023-08-07
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LoginInfo {
	private String username;
	private String password;
}
