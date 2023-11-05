package com.bloggingsite.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bloggingsite.model.GenericResponseBean;
import com.bloggingsite.model.User;
import com.bloggingsite.repository.UserRepository;

@Service
public class UserServices {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	public GenericResponseBean createUser(User user) {
		Optional<User> findByEmail = userRepo.findByEmail(user.getEmail());
		if(findByEmail.isPresent()) {
			return new GenericResponseBean(true,"User is already present");
		}
		String password = user.getPassword();
		user.setPassword(encoder.encode(password));
		User save = userRepo.save(user);
		return new GenericResponseBean(false,"user is created");
	}

}
