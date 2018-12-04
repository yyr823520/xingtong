package com.xt.xingtong.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xt.xingtong.interf.ModuleMapper;
import com.xt.xingtong.service.ModuleService;
@Service
public class ModuleImpl implements ModuleService{
@Autowired
private ModuleMapper dao;
	@Override
	public Object getModuleTree(int userId) {
		return dao.getModuleTree(userId);
	}

}
