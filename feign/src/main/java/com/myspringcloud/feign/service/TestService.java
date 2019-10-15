package com.myspringcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "client1", fallback = TestServiceImpl.class)
public interface TestService {

    @RequestMapping("hello")
    String hello();
}
