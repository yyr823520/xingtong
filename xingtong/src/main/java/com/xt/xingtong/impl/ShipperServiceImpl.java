package com.xt.xingtong.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xt.xingtong.entity.Shipper;
import com.xt.xingtong.info.Shipperinfo;
import com.xt.xingtong.interf.ShipperMapper;
import com.xt.xingtong.service.ShipperService;


@Service
public class ShipperServiceImpl implements ShipperService {
	@Autowired
	private ShipperMapper  samapper;

	@Override
	public int addShipper(Shipper shipper) {
		// TODO Auto-generated method stub
		return samapper.insert(shipper);
	}

	@Override
	public int updateByPrimaryKey(Shipper shipper) {
		// TODO Auto-generated method stub
		return samapper.updateByPrimaryKey(shipper);
	}

	@Override
	public int deleteShipperById(int sid) {
		// TODO Auto-generated method stub
		return samapper.deleteShipperById( sid);
	}

	@Override
	public List<Shipper> selectShipper(Shipperinfo sList) {
		// TODO Auto-generated method stub
		return samapper.selectShipper(sList);
	}

	@Override
	public Integer selectWareShipperCount(Shipperinfo sList) {
		// TODO Auto-generated method stub
		return samapper.selectWareShipperCount( sList);
	}


}
