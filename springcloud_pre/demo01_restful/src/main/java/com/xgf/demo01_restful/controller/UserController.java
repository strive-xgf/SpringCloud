package com.xgf.demo01_restful.controller;


import com.xgf.demo01_restful.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j  //lombok日志
public class UserController {

    //普通的地址表示方式（通过具体的地址来访问）  http://localhost:8080/users/find.do?id=1
    @RequestMapping(path = "/users/find.do", method = {RequestMethod.GET})
    public Object find(int id) {
        //到数据库中查询模拟
        User user = new User();
        user.setId(id);
        user.setUasername("strive_day");
        user.setPassword("111111");
        return user;
    }

//  restful表示方式
    //method = get，查询
    //1: 占位符  /user/{id}
    //2: 取path上的值  user/1 使用注解来取        (http://localhost:8080/users/21)
    @RequestMapping(path = "/users/{id}", method = {RequestMethod.GET})
    public Object get(@PathVariable("id") int userId) {//@PathVariable取得id的值1，赋值给与占位符变量的同名
        //模拟数据库查询
        log.info("get id "+userId);
        User user = new User();
        user.setId(userId);
        user.setUasername("strive_day");
        user.setPassword("222222");
        return user;
    }


    //method = delete 删除        http://localhost:8080/users/21
    @RequestMapping(path = "/users/{id}", method = {RequestMethod.DELETE})
    public Object delete(@PathVariable int id) {
        //到数据库中查询模拟
        log.info("删除了 id "+id);
        User user = new User();
        user.setId(id);
        user.setUasername("strive_day");
        user.setPassword("333333");
        return user;
    }
}
