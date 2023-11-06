package com.bloggingsite.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class JwtRequest {
	@NotEmpty
	@jakarta.validation.constraints.Email
	private String email;
	@NotEmpty
	private String password;
}
