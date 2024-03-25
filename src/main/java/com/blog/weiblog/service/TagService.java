package com.blog.weiblog.service;

import com.blog.weiblog.entity.BlogTagCount;
import com.blog.weiblog.utils.PageQueryUtil;
import com.blog.weiblog.utils.PageResult;

import java.util.List;

public interface TagService {
    int getTotalTags();

    Boolean deleteBatch(Integer[] ids);

    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    Boolean saveTag(String tagName);

    List<BlogTagCount> getBlogTagCountForIndex();
}
