package com.User.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.User.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	Optional<User> findByUserId(Integer userId);
	
}
