package com.ajacom.cache.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liucm
 *         Date 2019/4/4
 *         Time 14:59
 */
@Data
public class Employee implements Serializable{
    private Integer id;
    private String lastName;
    private Integer gender;
    private String email;
    private Integer dId;
}
