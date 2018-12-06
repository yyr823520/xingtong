package com.xt.xingtong.interf;

import java.util.List;

import com.xt.xingtong.entity.Shipper;
import com.xt.xingtong.info.Shipperinfo;

public interface ShipperMapper {
	/**
	 * 分页
	 * 
	 * @param sList
	 * @return
	 */
	Integer selectWareShipperCount(Shipperinfo sList);

	List<Shipper> selectShipper(Shipperinfo sList);

	/**
	 * 删除
	 * 
	 * @param sid
	 * @return
	 */
	int deleteShipperById(int sid);

	/**
	 * 修改
	 * 
	 * @param shipper
	 * @return
	 */
	int updateByPrimaryKey(Shipper shipper);

	/**
	 * 添加
	 * 
	 * @param shipper
	 * @return
	 */
	int insert(Shipper shipper);

}