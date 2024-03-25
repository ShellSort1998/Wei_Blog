package com.blog.weiblog.dao;

import com.blog.weiblog.entity.Blog;
import com.blog.weiblog.utils.PageQueryUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogMapper {

    int getTotalBlogs(PageQueryUtil pageQuery);

    List<Blog> getBlogList(PageQueryUtil pageQuery);

    Blog selectByPrimaryKey(Long blogId);

    int insertSelective(Blog record);

    int updateByPrimaryKeySelective(Blog record);

    int deleteBatch(Integer[] ids);

    int updateBlogCategorys(@Param("categoryName") String categoryName, @Param("categoryId") Integer categoryId, @Param("ids")Integer[] ids);

    List<Blog> findBlogList(PageQueryUtil pageUtil);

    List<Blog> findBlogListByType(@Param("type") int type, @Param("limit") int limit);

    int updateByPrimaryKey(Blog record);

    List<Blog> getBlogsPageByTagId(PageQueryUtil pageUtil);

    int getTotalBlogsByTagId(PageQueryUtil pageUtil);

    Blog selectBySubUrl(String subUrl);
}
