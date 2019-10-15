package com.myspringcloud.zuul.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myspringcloud.zuul.dao.SysUserMapper;
import com.myspringcloud.zuul.entity.SysUser;
import com.myspringcloud.zuul.service.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

/**
 * 用户表(SysUser)表服务实现类
 *
 * @author lijianguo
 * @since 2019-09-29 17:17:03
 */
@Service("sysUserService")
@Transactional(rollbackFor = Exception.class)
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public Set<String> findPermissions(String username) {
        return new HashSet<>();
    }
}