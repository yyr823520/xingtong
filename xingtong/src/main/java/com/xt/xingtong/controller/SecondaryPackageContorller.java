package com.xt.xingtong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xt.xingtong.entity.SecondaryPackage;
import com.xt.xingtong.info.SecondaryPackageinfo;
import com.xt.xingtong.service.SecondaryPackageService;
import com.xt.xingtong.tool.MapTool;

@RestController
@RequestMapping("/secondarypackage")
public class SecondaryPackageContorller {
	@Autowired
	private SecondaryPackageService service;

	/**
	 * 添加二次包装
	 * 
	 * @param ware
	 * @return
	 */
	@RequestMapping("/addSecondaryPackage")
	public Map<String, Object> addCustomPackge(SecondaryPackage orig) {
		Map<String, Object> map = new HashMap<String, Object>();
//SecondaryPackage originalType = service.existName(orig.getSecname());

//		if (originalType == null) {
			int bo = service.addSecondaryPackage(orig);
			return	MapTool.mapTool(bo, "添加二次包装");
		
	}

	/**
	 * 修改
	 * 
	 * @param orig
	 * @return
	 */
	@RequestMapping("/updateSecondaryPackage")
	public Map<String, Object> updateSecondaryPackage(SecondaryPackage orig) {
		Map<String, Object> map = new HashMap<String, Object>();
		SecondaryPackage originalType = service.existName(orig.getSecname());

		if (originalType == null) {
			int bo = service.updateByPrimaryKey(orig);
			map.put("success", true);
			map.put("message", "修改二次包装成功");

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
	@RequestMapping("/deleteSecondaryPackage")
	public Map<String, Object> deleteSecondaryPackage(int secid) {
		Map<String, Object> map = new HashMap<String, Object>();
		int bo = service.deleteSecondaryPackageById(secid);
		if (bo > 0) {
			map.put("success", true);
			map.put("message", "删除二次包装成功");
		} else {
			map.put("success", false);
			map.put("message", "删除二次包装失败！");
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
	@RequestMapping(value = "/selectSecondaryPackage", name = "仓库查询")
	public Map<String, Object> CustomPackge(SecondaryPackageinfo cList, BindingResult result) {
		Map<String, Object> map = new HashMap<String, Object>();
		cList.setStartIndex((cList.getPage() - 1) * cList.getLimit());
		List<SecondaryPackage> rList = service.selectSecondaryPackage(cList);// 获取的rows
		Integer total = service.selectSecondaryPackageCount(cList);// 获取的total

		map.put("rows", rList);
		map.put("total", total);
		map.put("code", 0);
		map.put("msg", "");
		return map;

	}

}
