package com.xt.xingtong.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xt.xingtong.entity.CustomPackge;
import com.xt.xingtong.info.CustomPackgeinfo;
import com.xt.xingtong.interf.CustomPackgeMapper;
import com.xt.xingtong.service.CustomPackgeService;

@Service
public class CustomPackgeServiceImpl implements CustomPackgeService {
	@Autowired
	private CustomPackgeMapper mapper;

	@Override
	public CustomPackge existName(String cuname) {
		// TODO Auto-generated method stub
		return mapper.existName( cuname);
	}

	@Override
	public int addCustomPackge(CustomPackge orig) {
		// TODO Auto-generated method stub
		return mapper.addCustomPackge( orig);
	}

	@Override
	public int updateByPrimaryKey(CustomPackge orig) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey( orig);
	}

	@Override
	public int deleteCustomPackgeById(int cuid) {
		// TODO Auto-generated method stub
		return mapper.deleteCustomPackgeById( cuid);
	}

	@Override
	public List<CustomPackge> selectCustomPackge(CustomPackgeinfo cList) {
		// TODO Auto-generated method stub
		return mapper.selectCustomPackge( cList);
	}

	@Override
	public Integer selectCustomPackgeCount(CustomPackgeinfo cList) {
		// TODO Auto-generated method stub
		return mapper.selectCustomPackgeCount( cList);
	}
}
