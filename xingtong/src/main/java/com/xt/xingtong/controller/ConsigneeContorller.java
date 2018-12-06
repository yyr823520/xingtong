package com.xt.xingtong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xt.xingtong.entity.Consignee;
import com.xt.xingtong.info.Consigneeinfo;
import com.xt.xingtong.service.ConsigneeService;
import com.xt.xingtong.tool.MapTool;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/consignee")
public class ConsigneeContorller {
@Autowired
private ConsigneeService conservice;
/**
 * 添加收货方
 * @param ware
 * @return
 */
@RequestMapping("/addConsignee")
	public Map<String, Object> addConsignee(Consignee cons) {
	Map<String, Object> map = new HashMap<String, Object>();
	int bo = conservice.addConsignee(cons);

	if (bo>0) {
			map.put("success", true);
			map.put("message", "添加收货方成功");
			
		} else {
			map.put("success", false);
			map.put("message", "添加收货方失败");
			
		}
	return map;
	}

@ApiOperation(value = "修改收货方", notes = "根据url的id来指定修改收货方资料")
@ApiImplicitParam(name = "consignee", value = "需修改的收货方信息", required = true, dataType = "Consignee")
@PostMapping("/updatecons")
public Map<String, Object> updateConsignee(Consignee cons) {
	Map<String, Object> map = new HashMap<String, Object>();
	int bo = conservice.updateByPrimaryKey(cons);
	if(bo>0) {
		map.put("success", true);
		map.put("message", "修改收货方资料成功");
		
	}else {
		
		map.put("success", false);
		map.put("message", "修改收货方资料失败");
		
	}
	return map;
}

	

@ApiOperation(value = "删除收货方", notes = "根据url的sid来指定删除收货方")
//@ApiImplicitParam(name = "sid", value = "需删除的备货区id", required = true, dataType = "int")
@PostMapping("/deleteConsignee")
public Map<String, Object> deleteConsignee(int conid) {
	Map<String, Object> map = new HashMap<String, Object>();
	int bo = conservice.deleteConsigneeById(conid);
	if (bo>0) {
		map.put("success", true);
		map.put("message", "删除收货方成功");
	} else {
		map.put("success",false);
		map.put("message", "删除收货方失败！");
	}
	return map;
}

	/**
	 * 分页查询
	 * @param wList
	 * @param result
	 * @returnhttp://localhost:8080/consignee/selectConsignee
	 */
@RequestMapping(value = "/selectConsignee", name = "收货方查询")
public Map<String, Object> selectConsignee(Consigneeinfo cList,BindingResult result) {
	Map<String, Object> map = new HashMap<String, Object>();
	cList.setStartIndex((cList.getPage()-1)*cList.getLimit());
	List<Consignee> rList = conservice.selectConsignee(cList);// 获取的rows
	Integer total = conservice.selectConsigneeCount(cList);// 获取的total
	return MapTool.getPagination(rList, total);

}

}
