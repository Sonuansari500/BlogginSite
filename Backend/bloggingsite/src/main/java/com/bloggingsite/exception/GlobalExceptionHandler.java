package com.bloggingsite.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put("error", "true");
			errors.put(fieldName, errorMessage);
		});
		return errors;
	}

	@ExceptionHandler(BadCredentialsException.class)
	public Map<String, String> exceptionHandler() {
		Map<String, String> errors = new HashMap<>();
		errors.put("error", "true");
		errors.put("message", "Credentials Invalid !!");
		return errors;
	}
	@ExceptionHandler(UserIsAlreadyPresent.class)
	public Map<String, String> userIsAlreadyPresent(UserIsAlreadyPresent e) {
		Map<String, String> errors = new HashMap<>();
		errors.put("error", "true");
		errors.put("message", e.getMessage());
		return errors;
	}
}