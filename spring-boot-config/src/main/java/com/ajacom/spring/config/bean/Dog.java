package com.ajacom.spring.config.bean;

import lombok.Data;

/**
 * @author liucm
 *         Date 2019/4/3
 *         Time 10:11
 */
@Data
public class Dog {

    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
