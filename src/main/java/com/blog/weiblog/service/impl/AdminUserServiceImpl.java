package com.blog.weiblog.service.impl;

import com.blog.weiblog.dao.AdminUserMapper;
import com.blog.weiblog.entity.AdminUser;
import com.blog.weiblog.service.AdminUserService;
import com.blog.weiblog.utils.MD5Util;
import org.apache.tomcat.util.security.MD5Encoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Resource
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUser login(String userName, String password) {
        String md5Psw = MD5Util.MD5Encode(password, "utf-8");
        return adminUserMapper.getUser(userName, md5Psw);
    }

    @Override
    public AdminUser getUserDetailById(Integer loginUserId) {
        return adminUserMapper.selectByPrimaryKey(loginUserId);
    }

    @Override
    public boolean updatePassword(Integer loginUserId, String originPsw, String newPsw) {
        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
        if (adminUser != null) {
            String md5OriginPsw = MD5Util.MD5Encode(originPsw, "utf-8");
            String md5NewPsw = MD5Util.MD5Encode(newPsw, "utf-8");
            if (adminUser.getLoginPassword().equals(md5OriginPsw)) {
                adminUser.setLoginPassword(md5NewPsw);
                if (adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean updateName(Integer loginUserId, String loginUserName, String nickName) {
        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
        if (adminUser != null) {
            adminUser.setLoginUserName(loginUserName);
            adminUser.setNickName(nickName);
            if (adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0) {
                return true;
            }
        }
        return false;
    }

}
