package com.blog.weiblog.dao;

import com.blog.weiblog.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper {

    AdminUser getUser(@Param("userName") String userName, @Param("userPassword") String md5Psw);

    AdminUser selectByPrimaryKey(@Param("loginUserId") Integer loginUserId);

    int updateByPrimaryKeySelective(@Param("recode") AdminUser recode);
}
