package com.mohan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/post")
	User newUser(@RequestBody User newUser) {
		return userRepository.save(newUser);
	}
	@GetMapping("/get")
	List<User> getAllUsers(){
		return userRepository.findAll();
	}
}
