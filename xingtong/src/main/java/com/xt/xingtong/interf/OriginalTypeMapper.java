package com.xt.xingtong.interf;

import java.util.List;

import com.xt.xingtong.entity.OriginalType;
import com.xt.xingtong.info.OriginalTypeinfo;

public interface OriginalTypeMapper {
	/**
	 * 查询有无相同的名称
	 * 
	 * @param otypename
	 * @return
	 */
	OriginalType existName(String otypename);

	/**
	 * 添加
	 * 
	 * @param orig
	 * @return
	 */
	int addTypeor(OriginalType orig);

	/**
	 * 修改
	 * 
	 * @param orig
	 * @return
	 */
	int updateByPrimaryKey(OriginalType orig);

	/**
	 * 删除
	 * 
	 * @param oid
	 * @return
	 */
	int deleteOriginalById(int oid);

	/**
	 * 分页
	 * 
	 * @param oList
	 * @return
	 */
	List<OriginalType> selectOriginalType(OriginalTypeinfo oList);

	Integer selectOriginalTypeCount(OriginalTypeinfo oList);
}