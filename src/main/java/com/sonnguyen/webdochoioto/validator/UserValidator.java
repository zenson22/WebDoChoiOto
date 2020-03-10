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
		if(user.getPhone().length()<10 || user.getPhone().length() >11) {
			errors.rejectValue("phone", "length.field");
		}
		if(user.getPassword().length()<8) {
			errors.rejectValue("password", "password_length.field");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone", "empty.field");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "empty.field");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "empty.field");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "empty.field");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fullName", "empty.field");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "empty.field");
	}

}
