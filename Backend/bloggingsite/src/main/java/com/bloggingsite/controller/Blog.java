package com.bloggingsite.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloggingsite.model.Blogs;

@RestController
@RequestMapping("/post")

public class Blog {

	@GetMapping("/")
	public List<Blogs> getAllBlog(){
		Blogs blog = new Blogs(1,"Tech","Ismlam Is Powerfull religion","description","image","blogDate","1","2");
		ArrayList<Blogs> blogsList = new ArrayList<Blogs>();
		blogsList.add(blog);
		return blogsList;
	}
}
