package com.bloggingsite.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int postId;
	private String title;
	private String summary;
	private String content;
	private String postImage;
	private Date createdDate;
	@ManyToOne
	private Category category;
	@ManyToOne
	private User user;
	

}
