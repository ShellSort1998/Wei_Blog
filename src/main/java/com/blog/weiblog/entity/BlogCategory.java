package com.blog.weiblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogCategory {
    private Integer categoryId;
    private String categoryName;
    private String categoryIcon;
    private Integer categoryRank;
    private Byte isDeleted;
    private Date createTime;
}
