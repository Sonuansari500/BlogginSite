package com.bloggingsite.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloggingsite.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

	public void deleteByCategoryId(Integer categoryId);

	public Optional<Category> findByCategoryId(Integer categoryID);


}
