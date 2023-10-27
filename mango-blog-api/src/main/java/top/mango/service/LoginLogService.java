package top.mango.service;

import org.springframework.scheduling.annotation.Async;
import top.mango.entity.LoginLog;

import java.util.List;

public interface LoginLogService {
	List<LoginLog> getLoginLogListByDate(String startDate, String endDate);

	@Async
	void saveLoginLog(LoginLog log);

	void deleteLoginLogById(Long id);
}
