package com.blueside.services.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.blueside.services.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	public User findByFirstName(String firstName);
	public User findByLastName(String lastName);
	public User findByEmailAddress(String emailAddress);
}
