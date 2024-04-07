package com.blog.weiblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private Long blogId;
    private String blogTitle;
    private String blogSubUrl;
    private String blogCoverImage;
    private String blogContent;
    private Integer blogCategoryId;
    private String blogCategoryName;
    private String blogTags;
    private Byte blogStatus;
    private Long blogViews;
    private Byte enableComment;
    private Byte isDeleted;
    private Date createTime;
    private Date updateTime;

}
