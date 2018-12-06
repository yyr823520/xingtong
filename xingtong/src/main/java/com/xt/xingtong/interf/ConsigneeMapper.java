package com.xt.xingtong.interf;

import java.util.List;

import com.xt.xingtong.entity.Consignee;
import com.xt.xingtong.info.Consigneeinfo;

public interface ConsigneeMapper {
/**
 * 添加
 * @param cons
 * @return
 */
	int addConsignee(Consignee cons);
/**
 * 修改
 * @param cons
 * @return
 */
	int updateByPrimaryKey(Consignee cons);
/**
 * 删除
 * @param conid
 * @return
 */
	int deleteConsigneeById(int conid);
/**
 * 分页
 * @param cList
 * @return
 */
	List<Consignee> selectConsignee(Consigneeinfo cList);

	Integer selectConsigneeCount(Consigneeinfo cList);
}