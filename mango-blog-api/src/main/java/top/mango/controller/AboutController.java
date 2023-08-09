package top.mango.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.mango.annotation.VisitLogger;
import top.mango.enums.VisitBehavior;
import top.mango.model.vo.Result;
import top.mango.service.AboutService;

/**
 * @Description: 关于我页面
 * @Author: Mango
 * @Date: 2023-08-07
 */
@RestController
public class AboutController {
	@Autowired
	AboutService aboutService;

	/**
	 * 获取关于我页面信息
	 *
	 * @return
	 */
	@VisitLogger(VisitBehavior.ABOUT)
	@GetMapping("/about")
	public Result about() {
		return Result.ok("获取成功", aboutService.getAboutInfo());
	}
}
