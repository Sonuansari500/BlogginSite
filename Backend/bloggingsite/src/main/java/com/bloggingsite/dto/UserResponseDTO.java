package com.bloggingsite.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class UserResponseDTO {
	private String jwtToken;
	private String username;
	private String role;
	private List<CategoryDTO> categories;
	private List<PostDTO> posts;
}
