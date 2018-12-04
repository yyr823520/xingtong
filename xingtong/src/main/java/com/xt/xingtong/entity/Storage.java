package com.xt.xingtong.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Storage {
    private Integer stid;

    private String rcompleteid;

    private Integer wid;

    private Date arrivaltime;

    private String status;

}