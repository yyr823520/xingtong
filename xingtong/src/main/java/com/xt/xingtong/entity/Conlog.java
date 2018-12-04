package com.xt.xingtong.entity;

import java.util.Date;

import lombok.Data;
@Data
public class Conlog {
    private Integer loginid;

    private String username;

    private Date logintime;

    private String computername;

    private String computerip;

 
}