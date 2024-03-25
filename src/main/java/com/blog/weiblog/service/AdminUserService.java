package com.blog.weiblog.service;

import com.blog.weiblog.entity.AdminUser;

public interface AdminUserService {

    AdminUser login(String userName, String password);

    AdminUser getUserDetailById(Integer loginUserId);

    boolean updatePassword(Integer loginUserId, String originPsw, String newPsw);

    boolean updateName(Integer loginUserId, String loginUserName, String nickName);
}
