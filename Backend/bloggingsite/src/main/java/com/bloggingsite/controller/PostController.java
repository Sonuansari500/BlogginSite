package com.bloggingsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloggingsite.dto.PostDTO;
import com.bloggingsite.services.PostServices;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class PostController {
	@Autowired
	private PostServices postServices;
	
	@GetMapping("/post")
	public ResponseEntity<List<PostDTO>> getAllPost(){
		List<PostDTO> allPost = postServices.getAllPost();
		return new ResponseEntity<List<PostDTO>>(allPost,HttpStatus.OK);
	}
	@PostMapping("/post")
	public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO post){
	PostDTO createPost = postServices.createPost(post);
		return new ResponseEntity<PostDTO>(createPost,HttpStatus.OK);
	}


}
