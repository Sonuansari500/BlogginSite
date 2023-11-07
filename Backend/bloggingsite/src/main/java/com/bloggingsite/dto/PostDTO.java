package com.bloggingsite.dto;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PostDTO {
	private int postId;
    private String title;
    private String summary ;
    private String content;
    private String postImage;
    private Date createdDate;
    private Integer categoryID ;
    private String userEmail;
}
