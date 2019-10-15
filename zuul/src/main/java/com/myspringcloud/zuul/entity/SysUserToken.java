package com.myspringcloud.zuul.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;
/**
 * 用户token表(SysUserToken)表实体类
 *
 * @author lijianguo
 * @since 2019-09-29 17:22:59
 */
@TableName("SYS_USER_TOKEN")
@Data
public class SysUserToken extends Model<SysUserToken> {
        
    @TableId
    private String id;
    /**
    * 用户ID
    */    
    private String userId;
        
    private String token;

    private Date expireTime;

}