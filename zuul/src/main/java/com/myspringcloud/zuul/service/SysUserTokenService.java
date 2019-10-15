package com.myspringcloud.zuul.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myspringcloud.zuul.entity.SysUserToken;

/**
 * 用户token表(SysUserToken)表服务接口
 *
 * @author lijianguo
 * @since 2019-09-29 17:22:59
 */
public interface SysUserTokenService extends IService<SysUserToken> {

    SysUserToken findByToken(String token);
}