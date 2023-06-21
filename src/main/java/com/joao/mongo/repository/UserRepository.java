package com.joao.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joao.mongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{
	
}
