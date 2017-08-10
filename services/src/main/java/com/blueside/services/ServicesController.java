package com.blueside.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blueside.services.entities.User;
import com.blueside.services.repositories.UserRepository;



@RestController
public class ServicesController {

	@Autowired
	private UserRepository repository;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public User index() {
		
		System.out.println("delete all and then add bob");
		repository.deleteAll();
		repository.save(new User("Bob", "Smith", "bob@bobsmith.com"));
		
		return repository.findByEmailAddress("bob@bobsmith.com");
	}
}
