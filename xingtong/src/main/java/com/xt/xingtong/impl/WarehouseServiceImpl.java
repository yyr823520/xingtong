package com.xt.xingtong.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xt.xingtong.entity.WareHouse;
import com.xt.xingtong.info.WareHouseinfo;
import com.xt.xingtong.interf.WareHouseMapper;
import com.xt.xingtong.service.WarehouseService;


@Service
public class WarehouseServiceImpl implements WarehouseService {
	@Autowired
	private WareHouseMapper mapper;

	@Override
	public int addWareHouse(WareHouse wareHouse) {
		// TODO Auto-generated method stub
		return mapper.insert(wareHouse);
	}

//	@Override
//	public List<WareHouse> existName(String warehousename) {
//		// TODO Auto-generated method stub
//		return mapper.existName(warehousename);
//	}

	@Override
	public int updateByPrimaryKey(WareHouse ware) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(ware) ;
	}

	@Override
	public int existsWareHouse() {
		// TODO Auto-generated method stub
		return mapper.existsWareHouse() ;
	}

	@Override
	public int deleteWareHouseById(int wid) {
		// TODO Auto-generated method stub
		return mapper.deleteWareHouseById(wid);
	}

	@Override
	public List<WareHouse> selectWareHouse(WareHouseinfo wList) {
		// TODO Auto-generated method stub
		return mapper.selectWareHouse( wList);
	}

	@Override
	public Integer selectWareHouseCount(WareHouseinfo wList) {
		// TODO Auto-generated method stub
		return mapper.selectWareHouseCount( wList);
	}
	
	
	
	

}
