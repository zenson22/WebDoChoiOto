package com.sonnguyen.webdochoioto.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sonnguyen.webdochoioto.model.UserDTO;
import com.sonnguyen.webdochoioto.validator.UserValidator;

@Controller
public class HomeController {
	
	
	@Autowired
	private UserValidator userValidator;

	@RequestMapping("/")
	public String homePage(HttpServletRequest request) {
		UserDTO userDTO=new UserDTO();
		userDTO.setUsername("Nhap ten cua ban");
		request.setAttribute("user", userDTO);
		return "home";
	}
	
	@RequestMapping(value="thong-tin-nguoi-dung",method=RequestMethod.POST)
	public String homePage(HttpServletRequest request,@ModelAttribute ("user") UserDTO userDTO,BindingResult bindingResult) {
		userValidator.validate(userDTO, bindingResult);
		if(bindingResult.hasErrors()) {
			return "home";
		}
		return "viewUser";
	}
}
