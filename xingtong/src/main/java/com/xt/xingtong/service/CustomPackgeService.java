package com.xt.xingtong.service;

import java.util.List;
import com.xt.xingtong.entity.CustomPackge;
import com.xt.xingtong.info.CustomPackgeinfo;


public interface CustomPackgeService {
	/**
	 * 查看有无相同的名字
	 * 
	 * @param cuname
	 * @return
	 */
	CustomPackge existName(String cuname);

	/**
	 * 添加
	 * 
	 * @param orig
	 * @return
	 */
	int addCustomPackge(CustomPackge orig);

	/**
	 * 修改
	 * 
	 * @param orig
	 * @return
	 */
	int updateByPrimaryKey(CustomPackge orig);

	/**
	 * 删除
	 * 
	 * @param cuid
	 * @return
	 */
	int deleteCustomPackgeById(int cuid);

	/**
	 * 分页
	 * 
	 * @param cList
	 * @return
	 */
	List<CustomPackge> selectCustomPackge(CustomPackgeinfo cList);

	Integer selectCustomPackgeCount(CustomPackgeinfo cList);

	

}
