package com.xt.xingtong.service;

import java.util.List;

import com.xt.xingtong.entity.Employee;
import com.xt.xingtong.info.Employeeinfo;

public interface EmployeeService {
	/**
	 * 查询在仓库中有无这个员工
	 * 
	 * @param ename
	 * @return
	 */
	List<Employee> existsName(String ename);

	/**
	 * 根据id删除
	 * 
	 * @param eid
	 * @return
	 */
	int deleteWareHouseById(int eid);

	/**
	 * 添加
	 * 
	 * @param emp
	 * @return
	 */
	int addEmployee(Employee emp);

	/**
	 * 修改
	 * 
	 * @param emp
	 * @return
	 */
	int updateByPrimaryKey(Employee emp);

	/**
	 * 分页
	 * 
	 * @param eList
	 * @return
	 */
	List<Employee> selectEmployee(Employeeinfo eList);

	Integer selectEmployeeCount(Employeeinfo eList);
/***
 * 用户登录
 * @param cardId
 * @param pass
 * @return
 */
	Employee userLogin(String cardId, String pass);

}
