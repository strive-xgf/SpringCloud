package com.xgf.demo01_provider_user_8001.controller;

import com.xgf.demo01_provider_user_8001.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    //http://localhost:8001/users/21
    @RequestMapping(path = "/{id}",method = {RequestMethod.GET})
    public Object  get(@PathVariable long id){
        //模拟数据库查询一个数据
        User user = new User();
        user.setId(id);
        user.setUsername("strive_day"+id);
        user.setPassword("123456");
        return user;    //RestController将user转成json
    }
}
