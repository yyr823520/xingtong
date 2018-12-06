package com.xt.xingtong.info;
import java.util.Date;
import lombok.Data;
@Data
public class Employeeinfo {
    private Integer eid;

    private String ename;

    private String esex;

    private Integer wid;

    private Date entrydate;

    private Date birthdate;

    private String eaddress;

    private String ecardnumber;

    private String epassword;

    private String ephone;

    private String isenable;

    private String eremark;
  
    private int type;
    
    private String orderBy;//按什么排序
    private Integer page = 0;//当前第几页
	private Integer limit;//每页大小
	private Integer startIndex = 0;//Mysql分页查询limit第一个参数
}