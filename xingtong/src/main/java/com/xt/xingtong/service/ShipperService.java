package com.xt.xingtong.service;

import java.util.List;

import com.xt.xingtong.entity.Shipper;
import com.xt.xingtong.info.Shipperinfo;

public interface ShipperService {
	/**
	 * 添加
	 * 
	 * @param shipper
	 * @return
	 */
	int addShipper(Shipper shipper);

	/**
	 * 修改
	 * 
	 * @param shipper
	 * @return
	 */
	int updateByPrimaryKey(Shipper shipper);

	/**
	 * 删除
	 * 
	 * @param sid
	 * @return
	 */
	int deleteShipperById(int sid);

	/**
	 * 分页
	 * 
	 * @param sList
	 * @return
	 */
	List<Shipper> selectShipper(Shipperinfo sList);

	Integer selectWareShipperCount(Shipperinfo sList);

}
