package com.xt.xingtong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xt.xingtong.entity.StorageArea;
import com.xt.xingtong.info.StorageAreainfo;
import com.xt.xingtong.service.StorageAreaService;
import com.xt.xingtong.tool.MapTool;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/storagearea")
public class StorageAreaContorller {
@Autowired
private StorageAreaService sservice;
/**
 * 添加备货区
 * @param ware
 * @return
 */
@PostMapping("/addStorageArea")
	public Map<String, Object> addStorageArea(StorageArea stor) {
	Map<String, Object> map = new HashMap<String, Object>();
	StorageArea storageArea = sservice.existName(stor.getAreaname());
	if (storageArea != null) {
			map.put("success", false);
			map.put("message", "仓库名称已存在");
			
		} else {
			int bo = sservice.addStorageArea(stor);
			map.put("success", true);
			map.put("message", "添加成功");
			
		}
	return map;
	}

@ApiOperation(value = "修改备货区", notes = "根据url的id来指定修改备货区信息")
@ApiImplicitParam(name = "ware", value = "需修改的备货区信息", required = true, dataType = "StorageArea")
@PostMapping("/updateStorageArea")
public Map<String, Object> updateStorageArea(StorageArea stor) {
	Map<String, Object> map = new HashMap<String, Object>();
	StorageArea storageArea = sservice.existName(stor.getAreaname());
	
	if(storageArea != null) {
		map.put("success", true);
		map.put("message", "仓库名称已存在");
		
	}else {
		int bo = sservice.updateByPrimaryKey(stor);
		map.put("success", false);
		map.put("message", "修改成功");
		
	}
	return map;
}

	

@ApiOperation(value = "删除备货区", notes = "根据url的sid来指定删除备货区" + "注意若该备货区下的资源正在被使用,则不可删除")
@ApiImplicitParam(name = "sid", value = "需删除的备货区id", required = true, dataType = "int")
@PostMapping("/deleteStorageArea")
public Map<String, Object> deleteStorageArea(int sid) {
	Map<String, Object> map = new HashMap<String, Object>();
	int result = sservice.existsStorageArea();
	if (result>0) {
		map.put("success", false);
		map.put("message", "该仓库正下还有货物,不可删除！");
		return map;

	} else {
		int bo = sservice.deleteStorageAreaById(sid);
		map.put("success",true);
		map.put("message", "仓库删除成功！");
	}
	return map;
}

	/**
	 * 分页查询
	 * @param wList
	 * @param result
	 * @return
	 */
@RequestMapping(value = "/selectStorageArea", name = "仓库查询")
public Map<String, Object> selectStorageArea(StorageAreainfo sList,BindingResult result) {
	Map<String, Object> map = new HashMap<String, Object>();
	sList.setStartIndex((sList.getPage()-1)*sList.getLimit());
	List<StorageArea> rList = sservice.selectStorageArea(sList);// 获取的rows
	Integer total = sservice.selectWareStorageAreaCount(sList);// 获取的total
	return MapTool.getPagination(rList, total);

}

}
