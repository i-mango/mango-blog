package top.mango.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.mango.entity.Moment;

import java.util.List;

/**
 * @Description: 博客动态持久层接口
 * @Author: Mango
 * @Date: 2023-08-07
 */
@Mapper
@Repository
public interface MomentMapper {
	List<Moment> getMomentList();

	int addLikeByMomentId(Long momentId);

	int updateMomentPublishedById(Long momentId, Boolean published);

	Moment getMomentById(Long id);

	int deleteMomentById(Long id);

	int saveMoment(Moment moment);

	int updateMoment(Moment moment);
}
