package com.bloggingsite.dto;

import java.util.List;

import com.bloggingsite.model.Category;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class UserResponseDTO {
	private String jwtToken;
	private String username;
	private List<CategoryDTO> categories;
}
