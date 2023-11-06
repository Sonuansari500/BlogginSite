package com.bloggingsite.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloggingsite.model.GenericResponseBean;
import com.bloggingsite.model.JwtRequest;
import com.bloggingsite.model.JwtResponse;
import com.bloggingsite.model.User;
import com.bloggingsite.security.JwtHelper;
import com.bloggingsite.services.UserServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class Authentication {
	private static final Logger LOGGER = LogManager.getLogger(Authentication.class);
	@Autowired
	private UserServices userService;
	 @Autowired
	    private UserDetailsService userDetailsService;

	    @Autowired
	    private AuthenticationManager manager;


	    @Autowired
	    private JwtHelper helper;
	    
	    @PostMapping("/signup")
	    public ResponseEntity<GenericResponseBean> signup(@Valid @RequestBody User request) {
	    	LOGGER.info("Signup controller is invoked");
	    	return new ResponseEntity<GenericResponseBean>(userService.createUser(request), HttpStatus.CREATED);
	    	
	    }

	    @PostMapping("/login")
	    public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request) {

	        this.doAuthenticate(request.getEmail(), request.getPassword());


	        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmail());
	        String token = this.helper.generateToken(userDetails);

	        JwtResponse response = JwtResponse.builder()
	                .jwtToken(token)
	                .username(userDetails.getUsername()).build();
	        return new ResponseEntity<>(response, HttpStatus.OK);
	    }
	    private void doAuthenticate(String email, String password) {

	        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
	        try {
	            manager.authenticate(authentication);


	        } catch (BadCredentialsException e) {
	            throw new BadCredentialsException(" Invalid Username or Password  !!");
	        }

	    }
	    
	    
}
