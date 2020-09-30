package com.example.consumer.controller;
import com.alibaba.fastjson.JSON;
import com.example.consumer.controller.client.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceClient userServiceClient;

    @GetMapping(value = "/xiange")
    private String index(){
        List<User> list=userServiceClient.select();
        return   JSON.toJSONString(list);
    }

}
