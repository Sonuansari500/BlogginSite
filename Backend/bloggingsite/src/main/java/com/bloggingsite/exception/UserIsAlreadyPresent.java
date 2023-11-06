package com.bloggingsite.exception;

public class UserIsAlreadyPresent extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserIsAlreadyPresent(String message) {
		super(message);
	}

}
