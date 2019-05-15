package com.zhouhao.study.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ������
 * ʹ��@EnableConfigurationProperties�����ò�����
 * ʹ��@ConditionalOnClass ������HelloService.class��classpath��ʱ���ô�������
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
