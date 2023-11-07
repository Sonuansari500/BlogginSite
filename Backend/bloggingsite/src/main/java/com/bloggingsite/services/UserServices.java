package com.bloggingsite.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bloggingsite.exception.UserIsAlreadyPresent;
import com.bloggingsite.model.User;
import com.bloggingsite.repository.UserRepository;

@Service
public class UserServices {
	@Autowired
	private UserRepository userRepo;

	
	@Autowired
	private PasswordEncoder encoder;
	
	public void createUser(User user) {
		try {
			Optional<User> findByEmail = userRepo.findByEmail(user.getEmail());
			if(findByEmail.isPresent()) {
				throw new UserIsAlreadyPresent("User is already present");
			}
			String password = user.getPassword();
			user.setPassword(encoder.encode(password));
			userRepo.save(user);
			
		}catch(Exception e) {
			throw new UserIsAlreadyPresent("User is already present");
		}
	}

	

}
