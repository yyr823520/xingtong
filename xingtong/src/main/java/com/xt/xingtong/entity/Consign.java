package com.xt.xingtong.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
@Data
public class Consign {
    private String consignid;

    private String destination;

    private Integer wid;

    private Integer receivenoteid;

    private BigDecimal originalprice;

    private String measurement;

    private BigDecimal totalmoney;

    private BigDecimal freightcharge;

    private BigDecimal receivingfee;

    private BigDecimal deliverycharge;

    private BigDecimal insuredvalue;

    private BigDecimal valuationfee;

    private BigDecimal totalcost;

    private Integer dictionaryid;

    private BigDecimal owetopay;

    private BigDecimal spotpayment;

    private BigDecimal tosubmit;

    private BigDecimal receiptfor;

    private BigDecimal monthlypay;

    private BigDecimal operatingcosts;

    private String otherdescription;

    private Date billingtime;

    private String operator;

    private String orderstatus;

    private Integer int0;

    private String string0;

    private String string2;

}