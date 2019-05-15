package com.zhouhao.study.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ����������
 * ʹ��@ConfigurationPropertiesע���Զ���һ���������󣬲�ָ�������ļ�application.properties�е�ǰ׺
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
