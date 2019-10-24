package com.myspringcloud.zuul.controller;

import com.alibaba.fastjson.JSONObject;
import com.myspringcloud.zuul.entity.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("mongodb")
public class MgDbController {
    @Resource
    private MongoTemplate mongoTemplate;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody SysUser sysUser) {
        SysUser user = mongoTemplate.save(sysUser, "sys_user");//向MongoDB里面插入数据
        log.info(JSONObject.toJSONString(user));
        return "success";
    }

    @GetMapping("get")
    public String get() {
        List<String> users = mongoTemplate.findAll(String.class, "sys_user");
        List<SysUser> sysUsers = new ArrayList<>();
        users.forEach(u-> sysUsers.add(JSONObject.parseObject(u, SysUser.class)));
        return "success";
    }
}