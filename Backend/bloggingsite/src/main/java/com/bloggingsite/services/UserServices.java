package com.bloggingsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bloggingsite.model.User;
import com.bloggingsite.repository.UserRepository;

@Service
public class UserServices {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	public User createUser(User user) {
		String password = user.getPassword();
		user.setPassword(encoder.encode(password));
		User save = userRepo.save(user);
		return save;
	}

}
