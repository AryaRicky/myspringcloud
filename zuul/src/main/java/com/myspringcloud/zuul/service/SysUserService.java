package com.myspringcloud.zuul.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myspringcloud.zuul.entity.SysUser;

import java.util.Set;

/**
 * 用户表(SysUser)表服务接口
 *
 * @author lijianguo
 * @since 2019-09-29 17:17:02
 */
public interface SysUserService extends IService<SysUser> {

    Set<String>  findPermissions(String username);
}