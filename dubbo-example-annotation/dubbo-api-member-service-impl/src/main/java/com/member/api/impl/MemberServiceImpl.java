package com.member.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.member.api.IMemberService;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Mr.PanYang on 2018/10/12.
 * <p>
 * 注意：
 * Dubbo 提供 @Service 将该接口注册到注册中心上去
 * Spring 提供 @Service 将类注入到 Spring 容器中
 */
@Service
public class MemberServiceImpl implements IMemberService {

    @Value("${dubbo.protocol.port}")
    private String dubboPort;

    @Override
    public String getUser() {
        System.out.println("订单服务调用会员服务,dubbo 服务端口：" + dubboPort);
        return "订单服务调用会员服务..." + dubboPort;
    }
}
