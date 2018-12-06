package com.xt.xingtong.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xt.xingtong.entity.OriginalType;
import com.xt.xingtong.info.OriginalTypeinfo;
import com.xt.xingtong.interf.OriginalTypeMapper;
import com.xt.xingtong.service.OriginalTypeService;
@Service
public class OriginalTypeServiceImpl implements OriginalTypeService{
@Autowired
private OriginalTypeMapper mapper;
	@Override
	public OriginalType existName(String otypename) {
		// TODO Auto-generated method stub
		return mapper.existName( otypename);
	}

	@Override
	public int addTypeor(OriginalType orig) {
		// TODO Auto-generated method stub
		return mapper.addTypeor( orig);
	}

	@Override
	public int updateByPrimaryKey(OriginalType orig) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey( orig);
	}

	@Override
	public int deleteOriginalById(int oid) {
		// TODO Auto-generated method stub
		return mapper.deleteOriginalById( oid);
	}

	@Override
	public List<OriginalType> selectOriginalType(OriginalTypeinfo oList) {
		// TODO Auto-generated method stub
		return mapper.selectOriginalType( oList);
	}

	@Override
	public Integer selectOriginalTypeCount(OriginalTypeinfo oList) {
		// TODO Auto-generated method stub
		return mapper.selectOriginalTypeCount( oList);
	}


}
