package com.blog.weiblog.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TestMapper {
    @Select("select nick_name from tb_admin_user where admin_user_id = #{id}")
    String selectNick_nameById(@Param("id") int id);
}
