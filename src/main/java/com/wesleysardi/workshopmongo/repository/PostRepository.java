package com.wesleysardi.workshopmongo.repository;

import com.wesleysardi.workshopmongo.domain.Post;
import com.wesleysardi.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
