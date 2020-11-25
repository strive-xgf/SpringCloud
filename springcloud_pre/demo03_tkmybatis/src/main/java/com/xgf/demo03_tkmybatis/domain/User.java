package com.xgf.demo03_tkmybatis.domain;

import lombok.Data;

import javax.persistence.*;

//以前开发mybatis的sql
//表的字段与类的成员变量的名称不一样，需要使用resultMap
@Table(name="tb_user")  //表名
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键自增
    private int id;
    @Column(name="girl_friend")     //属性名和列名不一致
    private String girlFriend;
    private String name;
    private String password;
    private String username;
    @Transient      //@Transient注解：忽略，不与数据库表任何字段对应
    private boolean isCheck; //跟表无关，是否选择

}
