package com.xt.xingtong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xt.xingtong.entity.OriginalType;
import com.xt.xingtong.info.OriginalTypeinfo;
import com.xt.xingtong.service.OriginalTypeService;
import com.xt.xingtong.tool.MapTool;

@RestController
@RequestMapping("/originaltype")
public class OriginalTypeContorller {
	@Autowired
	private OriginalTypeService orservice;

	/**
	 * 添加原包装类型
	 * 
	 * @param ware
	 * @return
	 */
	@RequestMapping("/addTypeor")
	public Map<String, Object> addTypeor(OriginalType orig) {
		Map<String, Object> map = new HashMap<String, Object>();
		OriginalType originalType = orservice.existName(orig.getOtypename());

		if (originalType == null) {
			int bo = orservice.addTypeor(orig);
			map.put("success", true);
			map.put("message", "添加原包装类型成功");

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
	@RequestMapping("/updateOriginalType")
	public Map<String, Object> updateOriginalType(OriginalType orig) {
		Map<String, Object> map = new HashMap<String, Object>();
		OriginalType originalType = orservice.existName(orig.getOtypename());

		if (originalType == null) {
			int bo = orservice.updateByPrimaryKey(orig);
			map.put("success", true);
			map.put("message", "修改原包装类型成功");

		} else {

			map.put("success", false);
			map.put("message", "修改原包装类型失败");

		}
		return map;
	}

	/**
	 * 删除
	 * 
	 * @param oid
	 * @return
	 */
	@RequestMapping("/deleteOriginalType")
	public Map<String, Object> deleteOriginalType(int oid) {
		Map<String, Object> map = new HashMap<String, Object>();
		int bo = orservice.deleteOriginalById(oid);
		if (bo > 0) {
			map.put("success", true);
			map.put("message", "删除原包装类型成功");
		} else {
			map.put("success", false);
			map.put("message", "删除原包装类型失败！");
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
	@RequestMapping(value = "/selectOriginalType", name = "仓库查询")
	public Map<String, Object> selectOriginalType(OriginalTypeinfo oList, BindingResult result) {
		Map<String, Object> map = new HashMap<String, Object>();
		oList.setStartIndex((oList.getPage() - 1) * oList.getLimit());
		List<OriginalType> rList = orservice.selectOriginalType(oList);// 获取的rows
		Integer total = orservice.selectOriginalTypeCount(oList);// 获取的total
		return MapTool.getPagination(rList, total);

	}

}
