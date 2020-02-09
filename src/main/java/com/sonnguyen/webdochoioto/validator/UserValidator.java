package com.sonnguyen.webdochoioto.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sonnguyen.webdochoioto.model.UserDTO;

public class UserValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		return UserDTO.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		UserDTO user=(UserDTO) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "empty.field");
		if(user.getPhone().length()<10) {
			errors.rejectValue("phone", "length.field");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone", "empty.field");
	}

}
