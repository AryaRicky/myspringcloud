package com.myspringcloud.zuul.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myspringcloud.zuul.dao.SysUserTokenMapper;
import com.myspringcloud.zuul.entity.SysUserToken;
import com.myspringcloud.zuul.service.SysUserTokenService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * 用户token表(SysUserToken)表服务实现类
 *
 * @author lijianguo
 * @since 2019-09-29 17:22:59
 */
@Service("sysUserTokenService")
@Transactional(rollbackFor = Exception.class)
public class SysUserTokenServiceImpl extends ServiceImpl<SysUserTokenMapper, SysUserToken> implements SysUserTokenService {

    @Override
    public SysUserToken findByToken(String token) {
        return getOne(new QueryWrapper<SysUserToken>().lambda().eq(SysUserToken::getToken, token).gt(SysUserToken::getExpireTime, new Date()));
    }
}