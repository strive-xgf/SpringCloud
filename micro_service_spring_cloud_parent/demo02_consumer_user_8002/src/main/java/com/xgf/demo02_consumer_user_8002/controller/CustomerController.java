package com.xgf.demo02_consumer_user_8002.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
@Slf4j
public class CustomerController {

    //需要在启动类创建当前对象RestTemplate，然后由Autowired去获取
    @Autowired
    RestTemplate rt;    //当前是使用RestTemplate调用demo01_provider服务提供者的数据

    //
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Object get(@PathVariable long id) {
        //消费工程，只是调用其他服务来获得想要的数据
        String url = "http://localhost:8001/users/"+id;  //参1: 地址
        String json = rt.getForObject(url, String.class);   //参2：数据要转换成什么类型
        return json;
    }
}