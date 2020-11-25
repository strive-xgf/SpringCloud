package com.xgf.demo03_tkmybatis.service;


import com.xgf.demo03_tkmybatis.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;
    @Test
    void test01() {
        //高级搜索页面的表单
        User user = new User();
        //user.setName("strive_day");
        user.setUsername("strive_gf@163.com");
        List<User> list = userService.queryByEntity(user);
        System.out.println(list);
    }
}