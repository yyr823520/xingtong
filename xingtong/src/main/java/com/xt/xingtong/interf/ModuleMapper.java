package com.xt.xingtong.interf;

import java.util.List;

import com.xt.xingtong.entity.Module;

public interface ModuleMapper {

	List<Module> getModuleTree(int userId);
   
}