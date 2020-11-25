package com.xgf.demo02_consumer_user_8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Demo02ConsumerUser8002Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo02ConsumerUser8002Application.class, args);
    }

    //将RestTemplate对象放入容器中
    @Bean
    public RestTemplate getRt() {
        RestTemplate rt = new RestTemplate();
        return rt;
    }
}
