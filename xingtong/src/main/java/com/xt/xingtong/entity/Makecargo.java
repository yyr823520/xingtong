package com.xt.xingtong.entity;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
@Data
public class Makecargo {
    private String makecargoid;

    private Date makecartime;

    private String vnumber;

    private Integer driverid;

    private String drivername;

    private BigDecimal receivingfee;

    private BigDecimal spotpayment;

    private BigDecimal owetopay;

    private String preregistrationid;

    private String operator;

    private String mremark;

    private Integer confirmstatus;

    private Integer int0;

    private String string0;

    private String string1;

  
}