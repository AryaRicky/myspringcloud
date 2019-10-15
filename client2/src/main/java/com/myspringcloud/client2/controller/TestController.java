package com.myspringcloud.client2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test")
    public String test() {
        return "it is a test2";
    }

    @RequestMapping("hello")
    public String hello() {
        System.out.println("join hello2 method...");
        return "hello world2";
    }

    @RequestMapping("admin")
    public String admin() {
        System.out.println("join admin method...");
        return "admin permission";
    }
}
