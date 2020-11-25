package com.xgf.demo03_tkmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.xgf.demo03_tkmybatis.mapper")   //扫描包
public class Demo03TkmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo03TkmybatisApplication.class, args);
    }

}
