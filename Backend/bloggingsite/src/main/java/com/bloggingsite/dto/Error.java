package com.bloggingsite.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Error {

	private boolean error;
	private String message;
}
