package com.zhouhao.study.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * 使用@EnableConfigurationProperties以启用参数类
 * 使用@ConditionalOnClass 表明当HelloService.class在classpath下时启用此配置类
 *
 * @author : zhouhao
 * @date : Created in 2019/4/1 7:59
 */
@Configuration
@EnableConfigurationProperties(HelloPropertyties.class)
@ConditionalOnClass(HelloService.class)
public class HelloServiceAutoConfiguration {
    @Autowired
    HelloPropertyties helloPropertyties;


    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setMsg(helloPropertyties.getMsg());
        return helloService;
    }
}
