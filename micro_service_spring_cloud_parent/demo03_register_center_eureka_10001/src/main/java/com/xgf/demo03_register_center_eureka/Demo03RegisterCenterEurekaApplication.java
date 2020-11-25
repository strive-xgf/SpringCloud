package com.xgf.demo03_register_center_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer   //添加Eureka的服务注解，表示作为一台服务器启动
public class Demo03RegisterCenterEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo03RegisterCenterEurekaApplication.class, args);
    }

}
