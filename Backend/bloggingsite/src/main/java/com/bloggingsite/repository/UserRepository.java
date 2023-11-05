package com.bloggingsite.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.bloggingsite.model.User;
@Component
public interface UserRepository extends JpaRepository<User, Long>{
	
	public Optional<User> findByEmail(String username);

}
