package com.xt.xingtong;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xt.xingtong.entity.Consignee;
import com.xt.xingtong.service.ConsigneeService;
import com.xt.xingtong.service.EmployeeService;
import com.xt.xingtong.service.StorageAreaService;

public class AddTest {
	@Autowired
	private ConsigneeService conservice;//收货方

	@Autowired
	private EmployeeService service;//员工
	
	@Autowired
	private StorageAreaService sservice;
	@Test
	  public void test()
	    {
		
	for (int i = 1; i <=50; i++) {
		Consignee consignee=new Consignee();
		consignee.setConname("杨洋"+i);
		consignee.setConaddress("郑州市中原区");
		consignee.setConphone("13623760439");
		conservice.addConsignee(consignee);
		
	}
	
	
		
	    }
	
	@Test
	  public void test1()
	    {
		//service.addEmployee(emp);
	    }
	@Test
	  public void test2()
	    {
		//sservice.addStorageArea(stor)
	    }
	

}
