package com.xt.xingtong.info;

import java.math.BigDecimal;

import lombok.Data;
@Data
public class Consigneeinfo {
    private Integer conid;

    private String conname;

    private String concompanyname;

    private String contelphone;

    private String confax;

    private String conphone;

    private String conemail;

    private String conqqormsn;

    private BigDecimal conearlyaccount;

    private String conaddress;

    private String conremark;
    private String orderBy;//按什么排序
    private Integer page = 0;//当前第几页
 	private Integer limit;//每页大小
 	private Integer startIndex = 0;//Mysql分页查询limit第一个参数

   
}