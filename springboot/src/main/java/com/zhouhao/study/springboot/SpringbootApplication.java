package com.zhouhao.study.springboot;

import com.zhouhao.study.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot 启动类
 *
 * @author zhouhao
 * @date 2019/03/26
 */
@SpringBootApplication
@RestController
public class SpringbootApplication {
    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String index(){
        return helloService.getMsg();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
