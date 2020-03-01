package com.sonnguyen.webdochoioto.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sonnguyen.webdochoioto.model.CategoryDTO;

public class CategoryValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		return CategoryDTO.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "empty.field");
	}

}
