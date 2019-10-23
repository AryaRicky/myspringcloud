package com.myspringcloud.zuul.controller;

import com.myspringcloud.zuul.entity.SysUser;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @RequestMapping("hello")
    public String hello() {
        SysUser sysUser = new SysUser();
        sysUser.setUsername("jack sc");
        redisTemplate.opsForValue().set("user", sysUser, 10, TimeUnit.MINUTES);
        return "hello";
    }

    @RequestMapping("get")
    public Object get() {
        return redisTemplate.opsForValue().get("user");
    }
}
