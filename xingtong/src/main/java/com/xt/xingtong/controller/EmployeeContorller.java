package com.xt.xingtong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xt.xingtong.entity.Employee;
import com.xt.xingtong.info.Employeeinfo;
import com.xt.xingtong.service.EmployeeService;
import com.xt.xingtong.tool.MapTool;

@RestController
@RequestMapping("/emp")
public class EmployeeContorller {
	@Autowired
	private EmployeeService service;
	
	/**
	 * 添加员工
	 * @param ware
	 * @retur
	 */
	@RequestMapping("/addEmployee")
		public Map<String, Object> addEmployee(Employee emp) {
		Map<String, Object> map = new HashMap<String, Object>();
		int bo = service.addEmployee(emp);
		if (bo>0) {
			map.put("success", true);
			map.put("message", "添加成功");
			} else {
				map.put("success", false);
				map.put("message", "添加失败");
			}
		return map;
		}

	/**
	 * 修改
	 * @param emp
	 * @return
	 */
	@PostMapping("/updateEmployee")
	public Map<String, Object> updateEmployee(Employee emp) {
		Map<String, Object> map = new HashMap<String, Object>();
		int bo = service.updateByPrimaryKey(emp);
		if(bo>0) {
			map.put("success", false);
			map.put("message", "修改成功");
		}else {
			map.put("success", true);
			map.put("message", "修改失败");
		}
		return map;
	}

		

	/**
	 * 删除
	 * @param eid
	 * @param ename
	 * @return
	 * http://localhost:8080/emp/deleteEmployee?eid=3&ename=董曼曼
	 */
	@RequestMapping("/deleteEmployee")
	public Map<String, Object> deleteWareHouse(int eid,String ename) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Employee> result = service.existsName(ename);
		if (result!=null) {
			map.put("success", false);
			map.put("message", "该仓库正下还有货物,不可删除！");
			

		} else {
			int bo = service.deleteWareHouseById(eid);
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
	@RequestMapping(value = "/selectEmployee", name = "员工查询")
	public Map<String, Object> selectUserAll(Employeeinfo eList,BindingResult result) {
		Map<String, Object> map = new HashMap<String, Object>();
		eList.setStartIndex((eList.getPage()-1)*eList.getLimit());
		List<Employee> rList = service.selectEmployee(eList);// 获取的rows
		Integer total = service.selectEmployeeCount(eList);// 获取的total
		return MapTool.getPagination(rList, total);

	}
	





	
	
	
	
	
		
	}

	
	


