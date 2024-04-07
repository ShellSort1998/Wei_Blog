package com.blog.weiblog.dao;

import com.blog.weiblog.entity.BlogTagRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogTagRelationMapper {

    int batchInsert(@Param("relationList")List<BlogTagRelation> blogTagRelations);

    int deleteByBlogId(Long blogId);

    List<Long> selectDistinctTagIds(Integer[] ids);
}
