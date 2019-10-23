package com.myspringcloud.zuul.controller;

import com.alibaba.fastjson.JSONObject;
import com.myspringcloud.zuul.entity.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("mongodb")
public class MgDbController {
    @Resource
    private MongoTemplate mongoTemplate;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody SysUser sysUser) {
        SysUser user = mongoTemplate.save(sysUser, "sysUser");//向MongoDB里面插入数据
        log.info(JSONObject.toJSONString(user));
        return "success";
    }
}