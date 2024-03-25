package com.blog.weiblog.dao;

import com.blog.weiblog.entity.BlogTag;
import com.blog.weiblog.entity.BlogTagCount;
import com.blog.weiblog.utils.PageQueryUtil;

import java.util.List;

public interface BlogTagMapper {

    int getTotalTags(PageQueryUtil pageQuery);

    BlogTag selectByTagName(String tagName);

    int batchInsertBlogTag(List<BlogTag> tagList);

    List<BlogTag> findTagList(PageQueryUtil pageUtil);

    int insertSelective(BlogTag record);

    int deleteBatch(Integer[] ids);

    List<BlogTagCount> getTagCount();

}
