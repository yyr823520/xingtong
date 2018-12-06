package com.xt.xingtong.interf;

import java.util.List;

import com.xt.xingtong.entity.CustomPackge;
import com.xt.xingtong.entity.OriginalType;
import com.xt.xingtong.info.CustomPackgeinfo;
import com.xt.xingtong.info.OriginalTypeinfo;

public interface CustomPackgeMapper {
	/**
	 * 查看名字
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