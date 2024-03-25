package com.blog.weiblog.dao;

import com.blog.weiblog.entity.BlogComment;
import com.blog.weiblog.utils.PageQueryUtil;

import java.util.List;
import java.util.Map;

public interface BlogCommentMapper {

    int getTotalComments(Map map);

    List<BlogComment> findBlogCommentList(Map map);

    int getTotalBlogComments(Map map);

    int deleteBatch(Integer[] ids);

    int checkDone(Integer[] ids);

    BlogComment selectByPrimaryKey(Long commentId);

    int updateByPrimaryKeySelective(BlogComment blogComment);

    int insertSelective(BlogComment record);
}
