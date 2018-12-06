package com.xt.xingtong.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xt.xingtong.entity.Consignee;
import com.xt.xingtong.info.Consigneeinfo;
import com.xt.xingtong.interf.ConsigneeMapper;
import com.xt.xingtong.service.ConsigneeService;

@Service
public class ConsigneeServiceImpl implements ConsigneeService {
	@Autowired
	private ConsigneeMapper mapper;

	@Override
	public int addConsignee(Consignee cons) {
		// TODO Auto-generated method stub
		return mapper.addConsignee(cons);
	}

	@Override
	public int updateByPrimaryKey(Consignee cons) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(cons);
	}

	@Override
	public int deleteConsigneeById(int conid) {
		// TODO Auto-generated method stub
		return mapper.deleteConsigneeById(conid);
	}

	@Override
	public List<Consignee> selectConsignee(Consigneeinfo cList) {
		// TODO Auto-generated method stub
		return mapper.selectConsignee(cList);
	}

	@Override
	public Integer selectConsigneeCount(Consigneeinfo cList) {
		// TODO Auto-generated method stub
		return mapper.selectConsigneeCount( cList);
	}


}
