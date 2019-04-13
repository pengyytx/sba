package com.dharma.api.sba.dao;

import com.dharma.api.sba.bean.Comment;

import java.util.List;

public interface CommentDal {

    List<Comment> getAll();

    Comment getById(String id);

    Comment addComment(Comment comment);

    Object getAllTags(String id);

    String addTag(String id,String key,String value);

    String starAnalysis();

    //删除

    //修改
}
