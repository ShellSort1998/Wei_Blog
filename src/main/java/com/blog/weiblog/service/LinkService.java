package com.blog.weiblog.service;

import com.blog.weiblog.entity.BlogLink;
import com.blog.weiblog.utils.PageQueryUtil;
import com.blog.weiblog.utils.PageResult;

import java.util.List;
import java.util.Map;

public interface LinkService {
    int getTotalLinks();

    PageResult getBlogLinkPage(PageQueryUtil pageUtil);

    Boolean saveLink(BlogLink link);

    BlogLink selectById(Integer id);

    Boolean updateLink(BlogLink tempLink);

    Boolean deleteBatch(Integer[] ids);

    Map<Byte, List<BlogLink>> getLinksForLinkPage();
}
