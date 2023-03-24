package com.User.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.User.entity.User;
import com.User.repository.UserRepo;


@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private RestTemplate restTemplate;

	public ResponseEntity<User> getUserById(Integer userId) {
		// TODO Auto-generated method stub
		java.util.Optional<User> userOptional = userRepo.findById(userId);
		if(userOptional.isPresent()) {
			User user = userOptional.get();
			return (ResponseEntity<User>) ResponseEntity.status(HttpStatus.OK).body(user);
		}else {
			return (ResponseEntity<User>) ResponseEntity.status(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
}
