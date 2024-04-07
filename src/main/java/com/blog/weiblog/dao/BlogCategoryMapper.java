package com.blog.weiblog.dao;

import com.blog.weiblog.entity.BlogCategory;
import com.blog.weiblog.utils.PageQueryUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogCategoryMapper {
    int getTotalCategories(PageQueryUtil pageQuery);

    List<BlogCategory> getCategoryList(PageQueryUtil pageQuery);

    BlogCategory selectByPrimaryKey(Integer blogCategoryId);

    int updateByPrimaryKeySelective(BlogCategory record);

    List<BlogCategory> findCategoryList(PageQueryUtil pageUtil);

    BlogCategory selectByCategoryName(String categoryName);

    int insertSelective(BlogCategory record);

    int deleteBatch(Integer[] ids);

    List<BlogCategory> selectByCategoryIds(@Param("categoryIds") List<Integer> categoryIds);
}
