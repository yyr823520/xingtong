package com.xt.xingtong.info;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Shipperinfo {
    private Integer sid;

    private String sname;

    private String companyname;

    private String stelephone;

    private String sfax;

    private String sphone;

    private String email;

    private String qqormsn;

    private BigDecimal earlyaccount;

    private String saddress;

    private String sremark;

    private String orderBy;//按什么排序
    private Integer page = 0;//当前第几页
	private Integer limit;//每页大小
	private Integer startIndex = 0;//Mysql分页查询limit第一个参数
}