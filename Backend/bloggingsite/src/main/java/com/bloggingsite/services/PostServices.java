package com.bloggingsite.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloggingsite.dto.PostDTO;
import com.bloggingsite.model.Category;
import com.bloggingsite.model.Post;
import com.bloggingsite.model.User;
import com.bloggingsite.repository.CategoryRepository;
import com.bloggingsite.repository.PostRepository;
import com.bloggingsite.repository.UserRepository;

@Service
public class PostServices {

	@Autowired
	private PostRepository postRepository;
	@Autowired	
	private UserRepository userRepository;
	@Autowired
	private CategoryRepository categoryRepository;

//	create
	public PostDTO createPost(PostDTO postDto) {
		 User user = userRepository.findByEmail(postDto.getUserEmail()).get();
		 Category category = categoryRepository.findByCategoryId(postDto.getCategoryID()).get();
	    Post converToModal = converToModal(postDto);
	    converToModal.setUser(user);
	    converToModal.setCategory(category);
		Post save = postRepository.save(converToModal);
		return convetToDTO(save);
		
		
	}
//	get
	public List<PostDTO> getAllPost(){
		ArrayList<PostDTO> allPost = new ArrayList<>();
		postRepository.findAll().forEach(post->{
			allPost.add(convetToDTO(post));
		});
		return allPost;
	}
//	delete
	
	public void deletPostById(Integer postId) {
		postRepository.deleteByPostId(postId);
	}

	public Post converToModal(PostDTO dto) {
		return Post.builder().
				summary(dto.getSummary()).postImage(dto.getPostImage()).
				title(dto.getTitle()).createdDate(new Date()).build();
	}
	public PostDTO convetToDTO(Post modal) {
		return PostDTO.builder().postId(modal.getPostId()).userEmail(modal.getUser().getEmail()).createdDate(modal.getCreatedDate()).content(modal.getContent()).title(modal.getTitle()).summary(modal.getSummary()).build();
	}

}
