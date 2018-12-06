package com.xt.xingtong.info;

import java.util.Date;
import lombok.Data;

@Data
public class WareHouseinfo {
	private Integer wid;
    private String warehousename;

    private String telephone;

    private String fax;

    private String phone;

    private String username;

    private String address;

    private String wremark;
    private String orderBy;//按什么排序
    private Integer page = 0;//当前第几页
	private Integer limit;//每页大小
	private Integer startIndex = 0;//Mysql分页查询limit第一个参数

 
}