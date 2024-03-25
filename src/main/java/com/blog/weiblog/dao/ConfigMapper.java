package com.blog.weiblog.dao;

import com.blog.weiblog.entity.BlogConfig;

import java.util.List;

public interface ConfigMapper {
    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig blogConfig);
}
