package com.xt.xingtong.service;

import java.util.List;

import com.xt.xingtong.entity.WareHouse;
import com.xt.xingtong.info.WareHouseinfo;

public interface WarehouseService {
	/**
	 * 添加仓库
	 * 
	 * @param wareHouse
	 * @return
	 */
	int addWareHouse(WareHouse wareHouse);

	//List<WareHouse> existName(String warehousename);

	int updateByPrimaryKey(WareHouse ware);

	int existsWareHouse();

	int deleteWareHouseById(int wid);

	List<WareHouse> selectWareHouse(WareHouseinfo wList);

	Integer selectWareHouseCount(WareHouseinfo wList);

}
