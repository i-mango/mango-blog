package top.mango.service;

import org.springframework.scheduling.annotation.Async;
import top.mango.entity.VisitLog;
import top.mango.model.dto.VisitLogUuidTime;

import java.util.List;

public interface VisitLogService {
	List<VisitLog> getVisitLogListByUUIDAndDate(String uuid, String startDate, String endDate);

	List<VisitLogUuidTime> getUUIDAndCreateTimeByYesterday();

	@Async
	void saveVisitLog(VisitLog log);

	void deleteVisitLogById(Long id);
}
