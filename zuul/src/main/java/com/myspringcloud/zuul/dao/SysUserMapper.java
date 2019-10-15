package com.myspringcloud.zuul.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myspringcloud.zuul.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表(SysUser)表数据库访问层
 *
 * @author lijianguo
 * @since 2019-09-29 17:17:02
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}