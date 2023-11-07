package com.bloggingsite.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloggingsite.dto.CategoryDTO;
import com.bloggingsite.model.Category;
import com.bloggingsite.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

//	create
	public CategoryDTO createCategory(CategoryDTO category) {
		Category categoryModal = converToModal(category);
		Category result = categoryRepository.save(categoryModal);
		return convetToDTO(result);
		
		
	}
//	get
	public List<CategoryDTO> getAllCategory(){
		ArrayList<CategoryDTO> allCategory = new ArrayList<>();
		categoryRepository.findAll().forEach(category->{
			allCategory.add(convetToDTO(category));
		});
		return allCategory;
	}
//	delete
	
	public void deletCategory(Integer categoryId) {
		categoryRepository.deleteByCategoryId(categoryId);
	}
//	update
	public CategoryDTO updateCategory(CategoryDTO category) {
		Category categoryModal = converToModal(category);
		Category result = categoryRepository.save(categoryModal);
		return convetToDTO(result);
		
	}
	public Category converToModal(CategoryDTO category) {
		return Category.builder().categoryName(category.getCategoryName()).build();
	}
	public CategoryDTO convetToDTO(Category category) {
		return CategoryDTO.builder().categoryId(category.getCategoryId()).categoryName(category.getCategoryName()).build();
	}


}
