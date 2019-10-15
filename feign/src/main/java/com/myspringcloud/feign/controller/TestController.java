package com.myspringcloud.feign.controller;

import com.myspringcloud.feign.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("hello")
    public String hello() {
        System.out.println("join feign hello");
        return testService.hello();
    }
}
