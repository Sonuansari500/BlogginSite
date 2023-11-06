package com.bloggingsite.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bloggingsite.dto.CategoryDTO;
import com.bloggingsite.exception.UserIsAlreadyPresent;
import com.bloggingsite.model.Category;
import com.bloggingsite.model.User;
import com.bloggingsite.repository.CategoryRepository;
import com.bloggingsite.repository.PostRepository;
import com.bloggingsite.repository.UserRepository;

@Service
public class UserServices {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private CategoryRepository cat;
	
	@Autowired
	private PostRepository postRepository;
	
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

	public List<CategoryDTO> getAllCategories() {
		ArrayList<CategoryDTO> categories =new ArrayList<>();
		CategoryDTO category = new CategoryDTO();
		List<Category> findAll = cat.findAll();
		for(Category cat : findAll) {
			category.setCategoryIDl(cat.getCategoryIDl());
			category.setCategoryName(cat.getCategoryName());
			categories.add(category);
		}
		return categories;
	}
	
//	public GenericResponseBean createPost(PostRequest request) {
//		Post post = new Post();
//		post.set
//		post.setTitile(request.getTitle());
//		post.setAuthorName(request.getAuthorName());
//		post.setCreateDate(new Date().toString());
//		post.setPostImage(request.getPostImage().getName());
//		post.setSummary(request.getSummary());
//		post.setContent(request.getContent());
//		return new GenericResponseBean();
//		
//	}

}
