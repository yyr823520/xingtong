package com.xt.xingtong.service;

import java.util.List;

import com.xt.xingtong.entity.SecondaryPackage;
import com.xt.xingtong.info.SecondaryPackageinfo;

public interface SecondaryPackageService {
	/**
	 * 查询名称
	 * 
	 * @param secname
	 * @return
	 */
	SecondaryPackage existName(String secname);

	/**
	 * 添加
	 * 
	 * @param orig
	 * @return
	 */
	int addSecondaryPackage(SecondaryPackage orig);

	/**
	 * 修改
	 * 
	 * @param orig
	 * @return
	 */
	int updateByPrimaryKey(SecondaryPackage orig);

	/**
	 * 删除
	 * 
	 * @param secid
	 * @return
	 */
	int deleteSecondaryPackageById(int secid);

	/**
	 * 分页
	 * 
	 * @param cList
	 * @return
	 */
	List<SecondaryPackage> selectSecondaryPackage(SecondaryPackageinfo cList);

	Integer selectSecondaryPackageCount(SecondaryPackageinfo cList);

}
