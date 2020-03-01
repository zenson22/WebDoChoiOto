package com.sonnguyen.webdochoioto.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sonnguyen.webdochoioto.model.ProductDTO;

public class ProductValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		return ProductDTO.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		ProductDTO productDto=(ProductDTO) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "empty.field");
		if(productDto.getSoLuong()<0) {
			errors.rejectValue("soLuong", "soLuong.field");
		}
		if(productDto.getBrandId()==-1) {
			errors.rejectValue("brandId", "selected.field");
		}
		if(productDto.getCategoryId()==-1) {
			errors.rejectValue("categoryId", "selected.field");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", "empty.field");
	}

}
