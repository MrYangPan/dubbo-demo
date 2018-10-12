package com.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.member.api.IMemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mr.PanYang on 2018/10/12.
 */
@RestController
public class OrderController {

    @Reference
    private IMemberService iMemberService;

    @RequestMapping("/OrderToMember")
    public String OrderToMember() {
        return iMemberService.getUser();
    }

}
