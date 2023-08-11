package top.mango.exception;

/**
 * @Description: 持久化异常
 * @Author: Mango
 * @Date: 2023-08-07
 */

public class PersistenceException extends RuntimeException {
	public PersistenceException() {
	}

	public PersistenceException(String message) {
		super(message);
	}

	public PersistenceException(String message, Throwable cause) {
		super(message, cause);
	}
}
