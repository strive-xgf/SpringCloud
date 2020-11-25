package com.xgf.demo01_restful.domain;

import lombok.Data;

@Data   //lombok，可以省略get/set、构造方法、toString等方法
public class User {
    private int id;
    private String uasername;
    private String password;
}
