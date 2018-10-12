package com.dubbo;

import com.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mr.PanYang on 2018/10/12.
 */
public class ConsumerApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("consumer.xml");
        UserService userService = (UserService) app.getBean("userService");
        String name = userService.getUserById(1);
        System.out.println("name：" + name);
    }
}
