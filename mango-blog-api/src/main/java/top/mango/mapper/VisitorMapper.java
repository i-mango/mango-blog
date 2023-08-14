package top.mango.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.mango.entity.Visitor;
import top.mango.model.dto.VisitLogUuidTime;

import java.util.List;

/**
 * @Description: 访客统计持久层接口
 * @Author: Mango
 * @Date: 2023-08-07
 */
@Mapper
@Repository
public interface VisitorMapper {
	List<Visitor> getVisitorListByDate(String startDate, String endDate);

	List<String> getNewVisitorIpSourceByYesterday();

	int hasUUID(String uuid);

	int saveVisitor(Visitor visitor);

	int updatePVAndLastTimeByUUID(VisitLogUuidTime dto);

	int deleteVisitorById(Long id);
}
