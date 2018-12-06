package com.xt.xingtong.service;

import java.util.List;

import com.xt.xingtong.entity.StorageArea;
import com.xt.xingtong.info.StorageAreainfo;

public interface StorageAreaService {

	StorageArea existName(String areaname);

	int updateByPrimaryKey(StorageArea stor);

	int addStorageArea(StorageArea stor);

	int existsStorageArea();

	int deleteStorageAreaById(int sid);
/**
 * 分页
 * @param sList
 * @return
 */
	List<StorageArea> selectStorageArea(StorageAreainfo sList);

	Integer selectWareStorageAreaCount(StorageAreainfo sList);
	
	
	
	
	
	
	
	

}
