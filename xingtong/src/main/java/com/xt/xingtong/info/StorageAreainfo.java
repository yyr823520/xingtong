package com.xt.xingtong.info;

import java.util.Date;
import lombok.Data;

@Data
public class StorageAreainfo {
	 private Integer sid;
    private String snumber;
    private String areaname;
    private Date creationdate;
    private String orderBy;//按什么排序
    private Integer page = 0;//当前第几页
	private Integer limit;//每页大小
	private Integer startIndex = 0;//Mysql分页查询limit第一个参数
   
}