package com.blog.weiblog.service;

import com.blog.weiblog.entity.BlogCategory;
import com.blog.weiblog.utils.PageQueryUtil;
import com.blog.weiblog.utils.PageResult;

import java.util.List;

public interface CategoryService {
    int getTotalCategories();

    List<BlogCategory> getAllCategories();

    PageResult getBlogCategoryPage(PageQueryUtil pageUtil);

    boolean saveCategory(String categoryName, String categoryIcon);

    boolean updateCategory(Integer categoryId, String categoryName, String categoryIcon);

    Boolean deleteBatch(Integer[] ids);
}
