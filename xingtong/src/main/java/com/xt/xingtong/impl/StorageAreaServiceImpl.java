package com.xt.xingtong.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xt.xingtong.entity.StorageArea;
import com.xt.xingtong.info.StorageAreainfo;
import com.xt.xingtong.interf.StorageAreaMapper;
import com.xt.xingtong.service.StorageAreaService;


@Service
public class StorageAreaServiceImpl implements StorageAreaService {
	@Autowired
	private StorageAreaMapper  samapper;

	@Override
	public StorageArea existName(String areaname) {
		// TODO Auto-generated method stub
		return samapper.existName(areaname);
	}

	@Override
	public int updateByPrimaryKey(StorageArea stor) {
		// TODO Auto-generated method stub
		return samapper.updateByPrimaryKey(stor);
	}

	@Override
	public int addStorageArea(StorageArea stor) {
		// TODO Auto-generated method stub
		return samapper.insert(stor);
	}

	@Override
	public int existsStorageArea() {
		// TODO Auto-generated method stub
		return samapper.existsStorageArea();
	}

	@Override
	public int deleteStorageAreaById(int sid) {
		// TODO Auto-generated method stub
		return samapper.deleteStorageAreaById(sid);
	}

	@Override
	public List<StorageArea> selectStorageArea(StorageAreainfo sList) {
		// TODO Auto-generated method stub
		return samapper.selectStorageArea(sList);
	}

	@Override
	public Integer selectWareStorageAreaCount(StorageAreainfo sList) {
		// TODO Auto-generated method stub
		return samapper.selectStorageAreaCount(sList);
	}
}
