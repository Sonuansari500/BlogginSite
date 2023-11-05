package com.bloggingsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bloggingsite.model.User;
import com.bloggingsite.repository.UserRepository;
@Service
public class CustomUserDetailServices implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByEmail(username).orElseThrow(()->new RuntimeException("Usernot found!"));
		return user;
	}

}
