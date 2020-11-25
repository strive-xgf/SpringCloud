package com.xgf.demo03_tkmybatis.mapper;

import com.xgf.demo03_tkmybatis.domain.User;


import tk.mybatis.mapper.common.Mapper;

//tk.mybatis 提供Mapper父接口，继承就可以直接使用
public interface UserDao extends Mapper<User> {
    //update、delete、select、insert方法可以全部省略，由tkmybatis实现
}
