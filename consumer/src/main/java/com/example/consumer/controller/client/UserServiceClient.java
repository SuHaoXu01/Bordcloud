package com.example.consumer.controller.client;
import pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "provider")
public interface UserServiceClient {
    @RequestMapping(value = "/xian")
    public List<User> select();
}
