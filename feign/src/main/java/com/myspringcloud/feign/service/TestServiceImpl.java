package com.myspringcloud.feign.service;

import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl implements TestService{

    @Override
    public String hello() {
        return "sorry hello";
    }
}
