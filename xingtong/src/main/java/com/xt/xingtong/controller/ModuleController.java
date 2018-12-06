package com.xt.xingtong.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xt.xingtong.service.ModuleService;

/**
 * jgjdjgjdjgj
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/module")
public class ModuleController {
	@Autowired
	private ModuleService moduleService;
	/**
	 * 前台首页tree显示jjjfgj
	 * @return
	 */
	@PostMapping("/getModuleTree")
	public  Object getResourcesPagination(int userId) {
		return  moduleService.getModuleTree(userId);
	}
	

}
