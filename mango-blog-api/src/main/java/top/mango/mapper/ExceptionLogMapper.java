package top.mango.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.mango.entity.ExceptionLog;

import java.util.List;

/**
 * @Description: 异常日志持久层接口
 * @Author: Mango
 * @Date: 2023-08-07
 */
@Mapper
@Repository
public interface ExceptionLogMapper {
	List<ExceptionLog> getExceptionLogListByDate(String startDate, String endDate);

	int saveExceptionLog(ExceptionLog log);

	int deleteExceptionLogById(Long id);
}
