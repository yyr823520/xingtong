package com.xt.xingtong.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
@Data
public class Maintenance {
    private Integer maid;

    private Date maintenancetime;

    private Integer driverid;

    private String vehiclenumber;

    private String drviername;

    private Integer dictionaryid;

    private BigDecimal money;

    private String remark;

    private String checkstatus;

    private Integer int0;

    private String string0;

    private String string1;

}