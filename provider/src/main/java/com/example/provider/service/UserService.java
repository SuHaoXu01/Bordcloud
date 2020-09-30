package com.example.provider.service;

import com.example.provider.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;

import javax.annotation.Resource;
import java.util.List;
@RestController
public class UserService {
    @Resource
    private UserMapper userMapper;


    @RequestMapping(value = "/xian")
    public List<User> select() {
        List<User> list=userMapper.select();
        return list;
    }
}
