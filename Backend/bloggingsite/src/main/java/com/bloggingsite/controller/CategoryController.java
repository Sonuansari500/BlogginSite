package com.bloggingsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloggingsite.dto.CategoryDTO;
import com.bloggingsite.services.CategoryService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/category")
	public ResponseEntity<List<CategoryDTO>> getAllCategory(){
		List<CategoryDTO> allCategory = categoryService.getAllCategory();
		return new ResponseEntity<List<CategoryDTO>>(allCategory,HttpStatus.OK);
	}
	@PostMapping("/category")
	public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO category){
		CategoryDTO createCategory = categoryService.createCategory(category);
		return new ResponseEntity<CategoryDTO>(createCategory,HttpStatus.OK);
	}

}
