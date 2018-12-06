package com.xt.xingtong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xt.xingtong.entity.WareHouse;
import com.xt.xingtong.info.WareHouseinfo;
import com.xt.xingtong.service.WarehouseService;
import com.xt.xingtong.tool.MapTool;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/ware")
public class WarehouseContorller {
	@Autowired
	private WarehouseService wservice;
	//wservice.addWareHouse(wareHouse);
	/**
	 * 添加仓库
	 * @param ware
	 * @return
	 * localhost:8080/ware/addWareHouse?warehousename=账族
	 */
	@PostMapping("/addWareHouse")
		public Map<String, Object> addWareHouse(WareHouse ware) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(ware);
		//List<WareHouse> wareHouse = wservice.existName(ware.getWarehousename());
		int bo = wservice.addWareHouse(ware);
		if (bo>0) {
			map.put("success", true);
			map.put("message", "添加成功");
			} else {
				map.put("success", false);
				map.put("message", "添加失败");
			}
		return map;
		}

	@ApiOperation(value = "修改仓库", notes = "根据url的id来指定修改仓库信息")
	@ApiImplicitParam(name = "ware", value = "需修改的仓库信息", required = true, dataType = "WareHouse")
	@PostMapping("/updateWareHouse")
	public Map<String, Object> updateWareHouse(WareHouse ware) {
		Map<String, Object> map = new HashMap<String, Object>();
		int bo = wservice.updateByPrimaryKey(ware);
		if(bo>0) {
			map.put("success", false);
			map.put("message", "修改成功");
		}else {
			map.put("success", true);
			map.put("message", "修改失败");
		}
		return map;
	}

		

	@ApiOperation(value = "删除仓库", notes = "根据url的wid来指定删除仓库" + "注意若该仓库下的资源正在被使用,则不可删除")
	@ApiImplicitParam(name = "wid", value = "需删除的仓库id", required = true, dataType = "int")
	@PostMapping("/deleteWareHouse")
	public Map<String, Object> deleteWareHouse(int wid) {
		Map<String, Object> map = new HashMap<String, Object>();
		int result = wservice.existsWareHouse();
		if (result>0) {
			map.put("success", false);
			map.put("msg", "该仓库正下还有货物,不可删除！");
			return map;

		} else {
			int bo = wservice.deleteWareHouseById(wid);
			return	MapTool.mapTool(bo, "仓库删除");
		}
	}

		/**
		 * 分页查询
		 * @param wList
		 * @param result
		 * @return
		 */
	@RequestMapping(value = "/selectUserAll", name = "仓库查询")
	public Map<String, Object> selectUserAll(WareHouseinfo wList) {
	System.out.println(wList);
	     wList.setStartIndex((wList.getPage()-1)*wList.getLimit());
		List<WareHouse> rList = wservice.selectWareHouse(wList);// 获取的rows
		Integer total = wservice.selectWareHouseCount(wList);// 获取的total
		return MapTool.getPagination(rList, total);

	}
	

	
	





	
	
	
	
	
		
	}

	
	


