package com.ajacom.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author liucm
 *         Date 2019/4/9
 *         Time 14:07
 */
@Data
@Entity
@Table(name = "tbl_user")
public class User {
    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;

    @Column(name = "last_name",length = 50)
    private String lastName;
    @Column
    private String email;
}
