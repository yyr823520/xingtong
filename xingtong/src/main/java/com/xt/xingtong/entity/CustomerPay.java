package com.xt.xingtong.entity;

import java.util.Date;
import lombok.Data;
@Data
public class CustomerPay {
    private Integer customerpayid;

    private String consignid;

    private String pay;

    private Date personpay;

    private Integer employeeid;

    private String cpremark;

}