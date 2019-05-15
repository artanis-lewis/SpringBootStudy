package com.zhouhao.study.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 参数对象类
 * 使用@ConfigurationProperties注解以定义一个参数对象，并指定参数文件application.properties中的前缀
 *
 * @author : zhouhao
 * @date : Created in 2019/4/1 7:49
 */
@ConfigurationProperties(prefix = "hello")
public class HelloPropertyties {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
