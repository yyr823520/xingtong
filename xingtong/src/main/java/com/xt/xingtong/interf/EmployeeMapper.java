package com.xt.xingtong.interf;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xt.xingtong.entity.Employee;
import com.xt.xingtong.info.Employeeinfo;

public interface EmployeeMapper {
/**
 * 查询仓库有无这个员工
 * @param ename
 * @return
 */
	List<Employee> existsName(String ename);
/**
 * 删除
 * @param eid
 * @return
 */
	int deleteWareHouseById(int eid);
/**
 * 添加
 * @param emp
 * @return
 */
	int addEmployee(Employee emp);
/**
 * 修改
 * @param emp
 * @return
 */
	int updateByPrimaryKey(Employee emp);
/**
 * 分页
 * @param eList
 * @return
 */
	List<Employee> selectEmployee(Employeeinfo eList);

	Integer selectEmployeeCount(Employeeinfo eList);
	/**
	 * 用户登录
	 * @param cardId
	 * @param pass
	 * @return
	 */
	Employee userLogin(@Param("cardId")String cardId,@Param("pass") String pass);
    
}