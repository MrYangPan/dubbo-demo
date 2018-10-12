package com.dubbo.service;

/**
 * Created by Mr.PanYang on 2018/8/20.
 */
public class UserServiceImpl implements UserService {

    public String getUserById(int id) {
        System.out.println("被客户端（消费者）消费：" + id);
        if (id == 1)
            return "马化腾";
        if (id == 2)
            return "扎克伯格";
        if (id == 3)
            return "马云";
        return "未找到用户";
    }
}
