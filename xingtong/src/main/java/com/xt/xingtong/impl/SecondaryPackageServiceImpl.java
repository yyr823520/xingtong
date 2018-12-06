package com.xt.xingtong.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xt.xingtong.entity.SecondaryPackage;
import com.xt.xingtong.info.SecondaryPackageinfo;
import com.xt.xingtong.interf.SecondaryPackageMapper;
import com.xt.xingtong.service.SecondaryPackageService;

@Service
public class SecondaryPackageServiceImpl implements SecondaryPackageService {
	@Autowired
	private SecondaryPackageMapper mapper;

	@Override
	public SecondaryPackage existName(String secname) {
		// TODO Auto-generated method stub
		return mapper.existName( secname);
	}

	@Override
	public int addSecondaryPackage(SecondaryPackage orig) {
		// TODO Auto-generated method stub
		return mapper.addSecondaryPackage( orig);
	}

	@Override
	public int updateByPrimaryKey(SecondaryPackage orig) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey( orig);
	}

	@Override
	public int deleteSecondaryPackageById(int secid) {
		// TODO Auto-generated method stub
		return mapper.deleteSecondaryPackageById( secid);
	}

	@Override
	public List<SecondaryPackage> selectSecondaryPackage(SecondaryPackageinfo cList) {
		// TODO Auto-generated method stub
		return mapper.selectSecondaryPackage( cList);
	}

	@Override
	public Integer selectSecondaryPackageCount(SecondaryPackageinfo cList) {
		// TODO Auto-generated method stub
		return mapper.selectSecondaryPackageCount( cList);
	}
}
