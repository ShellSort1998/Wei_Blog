package com.blog.weiblog.dao;

import com.blog.weiblog.entity.BlogLink;
import com.blog.weiblog.utils.PageQueryUtil;

import java.util.List;

public interface LinkMapper {
    int getTotalLinks(PageQueryUtil pageQuery);

    List<BlogLink> findLinkList(PageQueryUtil pageUtil);

    int insertSelective(BlogLink record);

    BlogLink selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BlogLink record);

    int deleteBatch(Integer[] ids);
}
