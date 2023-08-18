package top.mango.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Description: 访客更新DTO
 * @Author: Mango
 * @Date: 2023-08-07
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class VisitLogUuidTime {
	private String uuid;
	private Date time;
	private Integer pv;
}
