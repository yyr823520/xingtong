package com.xt.xingtong.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
@Data
public class RefuelRegister {
    private Integer reid;

    private Integer driverid;

    private Date refueltime;

    private String vehiclenumber;

    private String drviername;

    private Integer dictionaryid;

    private String petrolstation;

    private BigDecimal unitprice;

    private Integer quantity;

    private BigDecimal money;

    private String remark;

    private String ckeckstatus;

    private Integer int0;

    private String string0;

    private String string1;

}