package com.blog.weiblog.service;

import com.blog.weiblog.controller.vo.BlogDetailVO;
import com.blog.weiblog.controller.vo.SimpleBlogListVO;
import com.blog.weiblog.entity.Blog;
import com.blog.weiblog.utils.PageQueryUtil;
import com.blog.weiblog.utils.PageResult;

import java.util.List;

public interface BlogService {
    int getTotalBlogs();

    PageResult getBlogsPage(PageQueryUtil pageQuery);

    Blog getBlogById(Long blogId);

    String saveBlog(Blog blog);

    String updateBlog(Blog blog);

    Boolean deleteBatch(Integer[] ids);

    PageResult getBlogsForIndexPage(int page);

    List<SimpleBlogListVO> getBlogListForIndexPage(int type);

    BlogDetailVO getBlogDetail(Long blogId);

    PageResult getBlogsPageByTag(String tagName, int page);

    PageResult getBlogsPageByCategory(String categoryName, int page);

    PageResult getBlogsPageBySearch(String keyword, int page);

    BlogDetailVO getBlogDetailBySubUrl(String subUrl);
}
