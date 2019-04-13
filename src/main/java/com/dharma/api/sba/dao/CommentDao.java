package com.dharma.api.sba.dao;

import com.dharma.api.sba.bean.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentDao extends MongoRepository<Comment,String> {

}
