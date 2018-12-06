package com.xt.xingtong.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xt.xingtong.entity.Employee;
import com.xt.xingtong.info.Employeeinfo;
import com.xt.xingtong.interf.EmployeeMapper;
import com.xt.xingtong.service.EmployeeService;
@Service
public class EmployeeServiceImpl  implements EmployeeService{
@Autowired
private EmployeeMapper mapper;

@Override
public List<Employee> existsName(String ename) {
	// TODO Auto-generated method stub
	return mapper.existsName(ename);
}

@Override
public int deleteWareHouseById(int eid) {
	// TODO Auto-generated method stub
	return mapper.deleteWareHouseById(eid);
}

@Override
public int addEmployee(Employee emp) {
	// TODO Auto-generated method stub
	return mapper.addEmployee( emp);
}

@Override
public int updateByPrimaryKey(Employee emp) {
	// TODO Auto-generated method stub
	return mapper.updateByPrimaryKey( emp);
}

@Override
public List<Employee> selectEmployee(Employeeinfo eList) {
	// TODO Auto-generated method stub
	return mapper.selectEmployee( eList);
}

@Override
public Integer selectEmployeeCount(Employeeinfo eList) {
	// TODO Auto-generated method stub
	return mapper.selectEmployeeCount( eList);
}

@Override
public Employee userLogin(String cardId, String pass) {
	// TODO Auto-generated method stub
	return mapper.userLogin(cardId,pass);
}
}
