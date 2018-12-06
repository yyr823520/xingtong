package com.xt.xingtong.interf;

import java.util.List;

import com.xt.xingtong.entity.WareHouse;
import com.xt.xingtong.info.WareHouseinfo;

public interface WareHouseMapper {
	/**
	 * 添加
	 * 
	 * @param wareHouse
	 * @return
	 */
	int insert(WareHouse wareHouse);

	/**
	 * 获取到仓库名字
	 * 
	 * @param warehousename
	 * @return
	 */
	//List<WareHouse> existName(String warehousename);

	/**
	 * 修改
	 * 
	 * @param ware
	 * @return
	 */
	int updateByPrimaryKey(WareHouse ware);

	/**
	 * 查看有无数据 
	 * 
	 * @return
	 */
	int existsWareHouse();

	/**
	 * 根据wid删除
	 * 
	 * @param wid
	 * @return
	 */
	int deleteWareHouseById(int wid);

	/**
	 * 分页
	 * 
	 * @param wList
	 * @return
	 */
	List<WareHouse> selectWareHouse(WareHouseinfo wList);

	Integer selectWareHouseCount(WareHouseinfo wList);

}