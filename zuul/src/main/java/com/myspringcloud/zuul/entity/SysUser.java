package com.myspringcloud.zuul.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * 用户表(SysUser)表实体类
 *
 * @author lijianguo
 * @since 2019-09-29 17:17:01
 */
@TableName("SYS_USER")
@Data
public class SysUser extends Model<SysUser> {

    @TableId
    private String id;
    /**
    * 用户名
    */    
    private String username;
    /**
    * 手机号
    */    
    private String phone;
    /**
    * 密码
    */    
    private String password;

    private Integer status;

}