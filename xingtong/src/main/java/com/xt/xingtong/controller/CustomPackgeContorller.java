package com.xt.xingtong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xt.xingtong.entity.CustomPackge;
import com.xt.xingtong.info.CustomPackgeinfo;
import com.xt.xingtong.service.CustomPackgeService;

@RestController
@RequestMapping("/custompackge")
public class CustomPackgeContorller {
	@Autowired
	private CustomPackgeService cusservice;

	
	/**
	 * 添加定制包装
	 * 
	 * @param ware
	 * @return
	 */
	@RequestMapping("/addCustomPackge")
	public Map<String, Object> addCustomPackge(CustomPackge orig) {
		Map<String, Object> map = new HashMap<String, Object>();
		CustomPackge originalType = cusservice.existName(orig.getCuname());

		if (originalType == null) {
			int bo = cusservice.addCustomPackge(orig);
			map.put("success", true);
			map.put("message", "添加定制包装成功");

		} else {
			map.put("success", false);
			map.put("message", "添加失败");

		}
		return map;
	}

	/**
	 * 修改
	 * 
	 * @param orig
	 * @return
	 */
	@RequestMapping("/updateCustomPackge")
	public Map<String, Object> updateCustomPackge(CustomPackge orig) {
		Map<String, Object> map = new HashMap<String, Object>();
		CustomPackge originalType = cusservice.existName(orig.getCuname());

		if (originalType == null) {
			int bo = cusservice.updateByPrimaryKey(orig);
			map.put("success", true);
			map.put("message", "修改定制包装成功");

		} else {

			map.put("success", false);
			map.put("message", "修改失败");

		}
		return map;
	}

	/**
	 * 删除
	 * 
	 * @param oid
	 * @return
	 */
	@RequestMapping("/deleteCustomPackge")
	public Map<String, Object> deleteCustomPackge(int cuid) {
		Map<String, Object> map = new HashMap<String, Object>();
		int bo = cusservice.deleteCustomPackgeById(cuid);
		if (bo > 0) {
			map.put("success", true);
			map.put("message", "删除定制包装成功");
		} else {
			map.put("success", false);
			map.put("message", "删除定制包装失败！");
		}
		return map;
	}

	/**
	 * 分页查询
	 * 
	 * @param wList
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/selectCustomPackge", name = "仓库查询")
	public Map<String, Object> CustomPackge(CustomPackgeinfo cList, BindingResult result) {
		Map<String, Object> map = new HashMap<String, Object>();
		cList.setStartIndex((cList.getPage() - 1) * cList.getLimit());
		List<CustomPackge> rList = cusservice.selectCustomPackge(cList);// 获取的rows
		Integer total = cusservice.selectCustomPackgeCount(cList);// 获取的total

		map.put("rows", rList);
		map.put("total", total);
		map.put("code", 0);
		map.put("msg", "");
		return map;

	}

}
