package top.mango.exception;

/**
 * @Description: 非法请求异常
 * @Author: Mango
 * @Date: 2023-08-07
 */

public class BadRequestException extends RuntimeException {
	public BadRequestException() {
	}

	public BadRequestException(String message) {
		super(message);
	}

	public BadRequestException(String message, Throwable cause) {
		super(message, cause);
	}
}
