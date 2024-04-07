package com.blog.weiblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogTag {
    private Integer tagId;
    private String tagName;
    private Byte isDeleted;
    private Date createTime;
}
