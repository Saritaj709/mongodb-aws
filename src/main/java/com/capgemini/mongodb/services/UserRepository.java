package com.capgemini.mongodb.services;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.mongodb.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	public Optional<User> findByEmail(String email);
}
