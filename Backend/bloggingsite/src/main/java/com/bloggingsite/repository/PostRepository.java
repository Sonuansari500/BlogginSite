package com.bloggingsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloggingsite.model.Post;
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

	public void deleteByPostId(Integer postId);

}
