package com.xgf.demo02_rest_template;

import com.xgf.demo02_rest_template.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;


//调用demo01的UserController
//RestTemplate(类似postman)，可以模拟 http请求，如（get,post,delete,put）
@SpringBootTest
class Demo02RestTemplateApplicationTests {

    @Test
    void test01() {
        RestTemplate template = new RestTemplate();
        //发送delete请求
        template.delete("http://localhost:8080/users/21");
    }

    //restTemplate还可以将返回的json数据直接转换成java对象
    @Test
    void test02() {
        RestTemplate template = new RestTemplate();
        //发送get请求,将返回的json数据直接转换成java对象
        User user=template.getForObject("http://localhost:8080/users/21", User.class);
        System.out.println(user);
    }

}
