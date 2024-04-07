package com.blog.weiblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogComment {
    private Long commentId;
    private Long blogId;
    private String commentator;
    private String email;
    private String websiteUrl;
    private String commentBody;
    private Date commentCreateTime;
    private String commentatorIp;
    private String replyBody;
    private Date replyCreateTime;
    private Byte commentStatus;
    private Byte isDeleted;
}
