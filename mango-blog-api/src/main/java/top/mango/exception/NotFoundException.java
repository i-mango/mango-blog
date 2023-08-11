package top.mango.exception;

/**
 * @Description: 404异常
 * @Author: Mango
 * @Date: 2023-08-07
 */

public class NotFoundException extends RuntimeException {
	public NotFoundException() {
	}

	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
