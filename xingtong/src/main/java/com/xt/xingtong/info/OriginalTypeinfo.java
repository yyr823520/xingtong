package com.xt.xingtong.info;
import lombok.Data;
@Data
public class OriginalTypeinfo{
    private Integer oid;

    private String otypename;

    private String otype;

    private String oenglishname;

    private String orderBy;//按什么排序
    private Integer page = 0;//当前第几页
	private Integer limit;//每页大小
	private Integer startIndex = 0;//Mysql分页查询limit第一个参数
}