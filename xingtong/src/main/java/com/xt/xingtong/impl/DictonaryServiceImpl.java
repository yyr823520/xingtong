package com.xt.xingtong.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xt.xingtong.entity.Dictionary;
import com.xt.xingtong.info.Dictionaryinfo;
import com.xt.xingtong.interf.DictionaryMapper;
import com.xt.xingtong.service.DictonaryService;
@Service
public class DictonaryServiceImpl implements DictonaryService{
@Autowired
private DictionaryMapper mapper;

@Override
public int addcity(Dictionary cons) {
	// TODO Auto-generated method stub
	return mapper.addcity( cons);
}

@Override
public int addJy(Dictionary cons) {
	// TODO Auto-generated method stub
	return mapper.addJy( cons);
}

@Override
public int addry(Dictionary cons) {
	// TODO Auto-generated method stub
	return mapper.addry( cons);
}

@Override
public int addwx(Dictionary cons) {
	// TODO Auto-generated method stub
	return mapper.addwx( cons);
}

@Override
public int addjszh(Dictionary cons) {
	// TODO Auto-generated method stub
	return mapper.addjszh( cons);
}

@Override
public int addjs(Dictionary cons) {
	// TODO Auto-generated method stub
	return mapper.addjs( cons);
}

@Override
public int adddz(Dictionary cons) {
	// TODO Auto-generated method stub
	return mapper.adddz( cons);
}

@Override
public int updateByPrimaryKey(Dictionary cons) {
	// TODO Auto-generated method stub
	return mapper.updateByPrimaryKey( cons);
}

@Override
public int deleteConsigneeById(int did) {
	// TODO Auto-generated method stub
	return mapper.deleteConsigneeById( did);
}

@Override
public List<Dictionary> selectDictionary(Dictionaryinfo dList) {
	// TODO Auto-generated method stub
	return mapper.selectDictionary( dList);
}

@Override
public Integer selectDictionaryCount(Dictionaryinfo dList) {
	// TODO Auto-generated method stub
	return mapper.selectDictionaryCount( dList);
}

/**
 * 字典类型查询所有
 */
@Override
public List<Dictionary> selectByType(String type) {
	// TODO Auto-generated method stub
	return mapper.selectByType(type);
}

}
