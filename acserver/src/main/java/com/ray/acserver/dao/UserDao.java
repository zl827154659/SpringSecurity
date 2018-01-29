package com.ray.acserver.dao;

import com.ray.acserver.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    MongoTemplate mongoTemplate;

    public void addOne(User user) {
        this.mongoTemplate.insert(user);
    }

    public void update(User user) {
        this.mongoTemplate.save(user);
    }

    public User findOneByID(Long id) {
        return this.mongoTemplate.findById(id, User.class);
    }

    public void deleteByID(Long id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        this.mongoTemplate.remove(query, User.class);
    }

    public User findByUserName(String username){
        Query query = new Query();
        query.addCriteria(Criteria.where("username").is(username));
        return this.mongoTemplate.findOne(query, User.class);
    }
}
