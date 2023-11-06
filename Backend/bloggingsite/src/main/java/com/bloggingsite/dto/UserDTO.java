package com.bloggingsite.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
@Data
public class UserDTO {
	@NotEmpty
	@jakarta.validation.constraints.Email
	private String email;
	@NotEmpty
	private String password;
}
