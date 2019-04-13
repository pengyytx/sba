package com.dharma.api.sba.dao;

import com.dharma.api.sba.bean.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommentDalImpl implements CommentDal{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Comment> getAll() {

        return mongoTemplate.findAll(Comment.class);
    }

    @Override
    public Comment getById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return mongoTemplate.findOne(query,Comment.class);
    }

    @Override
    public Comment addComment(Comment comment) {
        mongoTemplate.save(comment);
        return comment;
    }

    @Override
    public Object getAllTags(String id) {
        Comment comment = getById(id);
        return  comment != null? comment.getTags():"comment not found";
    }

    @Override
    public String addTag(String id, String key, String value) {
        Comment comment = getById(id);
        if(comment!=null){
            comment.getTags().put(key,value);
            mongoTemplate.save(comment);
            return "Key Added";
        }else{
            return "comment not found";
        }
    }
}
