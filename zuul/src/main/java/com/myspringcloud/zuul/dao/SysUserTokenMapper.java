package com.myspringcloud.zuul.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myspringcloud.zuul.entity.SysUserToken;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户token表(SysUserToken)表数据库访问层
 *
 * @author lijianguo
 * @since 2019-09-29 17:22:59
 */
@Mapper
public interface SysUserTokenMapper extends BaseMapper<SysUserToken> {

}