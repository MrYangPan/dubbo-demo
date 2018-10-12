package com.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Mr.PanYang on 2018/8/20.
 */
public class DubboApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("provider.xml");
        app.start();
        System.out.println("dubbo 服务发布成功");
        // 让程序阻塞
        System.in.read();
    }
}
