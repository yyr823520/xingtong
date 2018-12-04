package com.xt.xingtong.entity;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
@Data
public class LoadingStart {
    private Integer loadid;

    private Date loadingstarttime;

    private String destinationnetwork;

    private Integer wid;

    private String waytonetwork;

    private String vnumber;

    private Integer driverid;

    private String drivername;

    private String phone;

    private BigDecimal carrierfee;

    private BigDecimal spotpayment;

    private BigDecimal owetopay;

    private String remark;

    private Integer startstatus;

    private Integer int0;

    private String string0;

    private String string1;

   
}