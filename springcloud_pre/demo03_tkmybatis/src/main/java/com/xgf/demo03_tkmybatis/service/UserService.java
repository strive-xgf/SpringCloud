package com.xgf.demo03_tkmybatis.service;

import com.xgf.demo03_tkmybatis.domain.User;
import com.xgf.demo03_tkmybatis.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserService {
    //调用dao
    @Autowired
    UserDao userDao;

    //tkmybatis查找
    public List<User> queryByEntity(User user){
        Example example = new Example(User.class);  //查询条件
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo(user);  //根据值来拼接出where 条件
        //where by username=?
        //where by name=?
        List<User> list = userDao.selectByExample(example);
        return list;
    }
}
