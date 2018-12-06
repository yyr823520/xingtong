package com.xt.xingtong.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.auth0.jwt.exceptions.TokenExpiredException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.xt.xingtong.entity.Employee;
import com.xt.xingtong.service.EmployeeService;
import com.xt.xingtong.service.ModuleService;
import com.xt.xingtong.tool.JwtToken;
import com.xt.xingtong.tool.Result;

@Controller
@ResponseBody
@RequestMapping("/login")
public class LoginController {
	 @Autowired
	 private EmployeeService employeeService;
		@Autowired
		private ModuleService moduleService;
	 private Map<String,Object> map=new HashMap<String,Object>();
	 private String token = null;
	 /**
	 * 首页登录
	 * @return
	 */
	@PostMapping("/userLogin")
	public  Object userLogin(String cardId,String pass) {
		Employee employee= employeeService.userLogin(cardId,pass);
		if(employee==null) {
				return new Result("身份编号或密码错误", 0);
		}
		else {
			// 构造一个token对象
			try {
				 token = JwtToken.sign(employee.getEid(), 4 * 60 * 60 * 1000);// 4*60*60*1000										// 四个小时有效期的token
				System.out.println("生成token大小=>" + token.length());
			} catch (TokenExpiredException e) {
				return new Result(2);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			map.put("token", token);// 响应给客户端的token令牌
			map.put("uid", employee.getEid());
			map.put("modules", moduleService.getModuleTree(employee.getEid()));
			map.put("name", employee.getEname());
			return new Result(map);// 登录成功
		}
	}
	




}