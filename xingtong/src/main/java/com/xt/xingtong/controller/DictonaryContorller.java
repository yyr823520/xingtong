package com.xt.xingtong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xt.xingtong.entity.Dictionary;
import com.xt.xingtong.info.Dictionaryinfo;
import com.xt.xingtong.service.DictonaryService;
import com.xt.xingtong.tool.MapTool;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/dic")
public class DictonaryContorller {
@Autowired
private DictonaryService dicservice;
/**
 * 添加收货方
 * @param ware
 * @return
 */
@RequestMapping("/addcity")
	public Map<String, Object> addCity(Dictionary cons) {
	Map<String, Object> map = new HashMap<String, Object>();
	int bo = dicservice.addcity(cons);

	if (bo>0) {
			map.put("success", true);
			map.put("message", "添加城市成功");
			
		} else {
			map.put("success", false);
			map.put("message", "添加城市失败");
			
		}
	return map;
	}


@RequestMapping("/addJy")
public Map<String, Object> addJy(Dictionary cons) {
Map<String, Object> map = new HashMap<String, Object>();
int bo = dicservice.addJy(cons);

if (bo>0) {
		map.put("success", true);
		map.put("message", "添加加油站成功");
		
	} else {
		map.put("success", false);
		map.put("message", "添加加油站失败");
		
	}
return map;
}



@RequestMapping("/addry")
public Map<String, Object> addry(Dictionary cons) {
Map<String, Object> map = new HashMap<String, Object>();
int bo = dicservice.addry(cons);

if (bo>0) {
		map.put("success", true);
		map.put("message", "添加燃油成功");
		
	} else {
		map.put("success", false);
		map.put("message", "添加燃油失败");
		
	}
return map;
}


@RequestMapping("/addwx")
public Map<String, Object> addwx(Dictionary cons) {
Map<String, Object> map = new HashMap<String, Object>();
int bo = dicservice.addwx(cons);

if (bo>0) {
		map.put("success", true);
		map.put("message", "添加维修站成功");
		
	} else {
		map.put("success", false);
		map.put("message", "添加维修站失败");
		
	}
return map;
}


@RequestMapping("/addjszh")
public Map<String, Object> addjszh(Dictionary cons) {
Map<String, Object> map = new HashMap<String, Object>();
int bo = dicservice.addjszh(cons);

if (bo>0) {
		map.put("success", true);
		map.put("message", "添加结算账户公用站成功");
		
	} else {
		map.put("success", false);
		map.put("message", "添加结算账户公用失败");
		
	}
return map;
}

@RequestMapping("/addjs")
public Map<String, Object> addjs(Dictionary cons) {
Map<String, Object> map = new HashMap<String, Object>();
int bo = dicservice.addjs(cons);

if (bo>0) {
		map.put("success", true);
		map.put("message", "添加结算方式站成功");
		
	} else {
		map.put("success", false);
		map.put("message", "添加结算方式失败");
		
	}
return map;
}

@RequestMapping("/adddz")
public Map<String, Object> adddz(Dictionary cons) {
Map<String, Object> map = new HashMap<String, Object>();
int bo = dicservice.adddz(cons);

if (bo>0) {
		map.put("success", true);
		map.put("message", "添加订单状态表站成功");
		
	} else {
		map.put("success", false);
		map.put("message", "添加订单状态表失败");
		
	}
return map;
}



@ApiOperation(value = "修改资料", notes = "根据url的id来指定修改资料资料")
//@ApiImplicitParam(name = "consignee", value = "需修改的收货方信息", required = true, dataType = "Consignee")
@PostMapping("/updateDictonary")
public Map<String, Object> updateDictonary(Dictionary cons) {
	Map<String, Object> map = new HashMap<String, Object>();
	int bo = dicservice.updateByPrimaryKey(cons);
	if(bo>0) {
		map.put("success", true);
		map.put("message", "修改资料成功");
		
	}else {
		
		map.put("success", false);
		map.put("message", "修改资料失败");
		
	}
	return map;
}

	

@ApiOperation(value = "删除资料", notes = "根据url的did来指定删除资料")
//@ApiImplicitParam(name = "sid", value = "需删除的备货区id", required = true, dataType = "int")
@PostMapping("/deleteDictonary")
public Map<String, Object> deleteDictonary(int did) {
	Map<String, Object> map = new HashMap<String, Object>();
	int bo = dicservice.deleteConsigneeById(did);
	if (bo>0) {
		map.put("success", true);
		map.put("message", "删除资料成功");
	} else {
		map.put("success",false);
		map.put("message", "删除资料失败！");
	}
	return map;
}

	/**
	 * 分页查询
	 * @param wList
	 * @param result
	 * @return
	 */
@RequestMapping(value = "/selectDictonary", name = "字典查询")
public Map<String, Object> selectDictonary(Dictionaryinfo dList,BindingResult result) {
	dList.setStartIndex((dList.getPage()-1)*dList.getLimit());
	List<Dictionary> rList = dicservice.selectDictionary(dList);// 获取的rows
	Integer total = dicservice.selectDictionaryCount(dList);// 获取的total
	return MapTool.getPagination(rList, total);

}



@RequestMapping(value = "/selectByType", name = "字典类型查询所有")
public Object selectByType(String type) {
	List<Dictionary> rList = dicservice.selectByType(type);// 获取的rows
	return rList;

}




}
