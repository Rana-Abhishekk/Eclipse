package com.User.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.User.entity.Book;
import com.User.entity.User;
import com.User.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("{userId}")
	public List getUserById(@PathVariable Integer  userId) {
		
		ResponseEntity<User> user = userService.getUserById(userId);
	    User userDto = user.getBody();
	    
	    List books = this.restTemplate.getForObject("http://localhost:8083/book/user/" + userDto.getUserId(), List.class);
//		List books = this.restTemplate.getForObject("http://localhost:8083/book/user/" + userId, List.class);
		
		
		
		
		
		return books;
		
	}

}
