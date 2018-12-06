package com.xt.xingtong.service;

import java.util.List;

import com.xt.xingtong.entity.Consignee;
import com.xt.xingtong.info.Consigneeinfo;

public interface ConsigneeService {
	/**
	 * 添加收货方
	 * 
	 * @param cons
	 * @return
	 */
	int addConsignee(Consignee cons);

	/**
	 * 修改收货方
	 * 
	 * @param cons
	 * @return
	 */
	int updateByPrimaryKey(Consignee cons);

	/**
	 * 删除收货方
	 * 
	 * @param sid
	 * @return
	 */
	int deleteConsigneeById(int conid);

	/**
	 * 分页查询
	 * 
	 * @param cList
	 * @return
	 */
	List<Consignee> selectConsignee(Consigneeinfo cList);

	Integer selectConsigneeCount(Consigneeinfo cList);

}
