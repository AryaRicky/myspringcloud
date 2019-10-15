package com.myspringcloud.client1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${server.port}")
    private String env;
    @Value("${data.user.password}")
    private String password;

    @RequestMapping("test")
    public String test() {
        System.out.println(env);
        System.out.println(password);
        return "it is a test " + password;
    }

    @RequestMapping("hello")
    public String hello() {
        System.out.println("join hello method...");
        return "hello world";
    }

    @RequestMapping("admin")
    public String admin() {
        System.out.println("join admin method...");
        return "admin permission";
    }
}
