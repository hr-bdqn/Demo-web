package com.hr.controller;

import com.alibaba.fastjson.JSON;
import com.hr.entity.User;
import com.hr.service.UserService;
import com.hr.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author liuhuanran
 * @version 1.0
 * @date 2020/6/15 15:46
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/testRegister")
    @ResponseBody
    public String save() {
        try {
            User acctUser = new User();

            acctUser.setUserId(UUID.getUId());
            acctUser.setCallphone("18326362275");
            acctUser.setCreate_time(new Date());
            acctUser.setEmail("18326362275@163.com");
            acctUser.setSalt("1234314");
            acctUser.setUserName("lhr");
            acctUser.setPassword("root");
            userService.registerUser(acctUser);
            return "注册成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "注册失败";
    }

}