package com.bloggingsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloggingsite.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
