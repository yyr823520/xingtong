package com.xt.xingtong.service;

import java.util.List;

import com.xt.xingtong.entity.Dictionary;
import com.xt.xingtong.info.Dictionaryinfo;

public interface DictonaryService {
	/**
	 * 添加
	 * 
	 * @param cons
	 * @return
	 */
	int addcity(Dictionary cons);

	int addJy(Dictionary cons);

	int addry(Dictionary cons);

	int addwx(Dictionary cons);

	int addjszh(Dictionary cons);

	int addjs(Dictionary cons);

	int adddz(Dictionary cons);

	/**
	 * 修改
	 * 
	 * @param cons
	 * @return
	 */
	int updateByPrimaryKey(Dictionary cons);

	/**
	 * 删除
	 * 
	 * @param did
	 * @return
	 */
	int deleteConsigneeById(int did);

	/**
	 * 分页
	 * 
	 * @param dList
	 * @return
	 */
	List<Dictionary> selectDictionary(Dictionaryinfo dList);

	Integer selectDictionaryCount(Dictionaryinfo dList);
/**
 * 字典类型查询所有
 * @param type 类型
 * @return
 */
	List<Dictionary> selectByType(String type);

}
