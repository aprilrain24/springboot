package com.ajacom.cache.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liucm
 *         Date 2019/4/4
 *         Time 15:00
 */
@Data
public class Department implements Serializable {
    private Integer id;
    private String departmentName;
}
