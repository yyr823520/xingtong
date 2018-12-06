package com.xt.xingtong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xt.xingtong.entity.Shipper;
import com.xt.xingtong.info.Shipperinfo;
import com.xt.xingtong.service.ShipperService;
import com.xt.xingtong.tool.MapTool;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/shipper")
public class ShipperContorller {
@Autowired
private ShipperService shservice;
/**
 * 添加发货方
 * @param ware
 * @return
 */
@RequestMapping("/addShippere")
	public Map<String, Object> addShipper(Shipper shipper) {
	Map<String, Object> map = new HashMap<String, Object>();
	int bo = shservice.addShipper(shipper);

	if (bo>0) {
			map.put("success", true);
			map.put("message", "添加发货方成功");
			
		} else {
			map.put("success", false);
			map.put("message", "添加发货方失败");
			
		}
	return map;
	}

@ApiOperation(value = "修改发货方", notes = "根据url的id来指定修改发货方资料")
@ApiImplicitParam(name = "Shipper", value = "需修改的发货方信息", required = true, dataType = "Shipper")
@PostMapping("/updateShipper")
public Map<String, Object> updateShipper(Shipper shipper) {
	Map<String, Object> map = new HashMap<String, Object>();
	int bo = shservice.updateByPrimaryKey(shipper);
	if(bo>0) {
		map.put("success", true);
		map.put("message", "修改发货方资料成功");
		
	}else {
		
		map.put("success", false);
		map.put("message", "修改发货方资料失败");
		
	}
	return map;
}

	

@ApiOperation(value = "删除", notes = "根据url的sid来指定删除")
//@ApiImplicitParam(name = "sid", value = "需删除的备货区id", required = true, dataType = "int")
@PostMapping("/deleteShipper")
public Map<String, Object> deleteShipper(int sid) {
	Map<String, Object> map = new HashMap<String, Object>();
	int bo = shservice.deleteShipperById(sid);
	if (bo>0) {
		map.put("success", true);
		map.put("message", "删除发货方成功");
	} else {
		map.put("success",false);
		map.put("message", "删除发货方失败！");
	}
	return map;
}

	/**
	 * 分页查询
	 * @param sList
	 * @param result
	 * @return
	 */
@RequestMapping(value = "/selectShipper", name = "发货方查询")
public Map<String, Object> selectShipper(Shipperinfo sList,BindingResult result) {
	Map<String, Object> map = new HashMap<String, Object>();
	sList.setStartIndex((sList.getPage()-1)*sList.getLimit());
	List<Shipper> rList = shservice.selectShipper(sList);// 获取的rows
	Integer total = shservice.selectWareShipperCount(sList);// 获取的total
	return MapTool.getPagination(rList, total);

}

}
