package com.xt.xingtong.info;

import lombok.Data;

@Data
public class SecondaryPackageinfo {
    private Integer secid;

    private String secname;

    private String secrule;

    private String secdescription;

    private Double secweight;

    private String measureunit;

    private Double seclength;

    private Double secwidth;

    private Double sechigh;

    private Double volumn;

    private String orderBy;//按什么排序
    private Integer page = 0;//当前第几页
	private Integer limit;//每页大小
	private Integer startIndex = 0;//Mysql分页查询limit第一个参数
   
}