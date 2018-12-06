package com.xt.xingtong.interf;

import java.util.List;

import com.xt.xingtong.entity.StorageArea;
import com.xt.xingtong.info.StorageAreainfo;

public interface StorageAreaMapper {

	int deleteStorageAreaById(int sid);

	int insert(StorageArea stor);

	int existsStorageArea();

	int updateByPrimaryKey(StorageArea stor);

	StorageArea existName(String areaname);

	List<StorageArea> selectStorageArea(StorageAreainfo sList);

	Integer selectStorageAreaCount(StorageAreainfo sList);


}