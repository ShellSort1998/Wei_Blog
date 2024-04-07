package com.blog.weiblog.service;

import com.blog.weiblog.entity.BlogComment;
import com.blog.weiblog.utils.PageQueryUtil;
import com.blog.weiblog.utils.PageResult;

public interface CommentService {
    int getTotalComments();

    Boolean deleteBatch(Integer[] ids);

    PageResult getCommentsPage(PageQueryUtil pageUtil);

    Boolean checkDone(Integer[] ids);

    Boolean reply(Long commentId, String replyBody);

    PageResult getCommentPageByBlogIdAndPageNum(Long blogId, int page);

    Boolean addComment(BlogComment comment);
}
