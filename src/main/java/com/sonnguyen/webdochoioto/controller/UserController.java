package com.sonnguyen.webdochoioto.controller;

import javax.servlet.http.HttpServletRequest;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sonnguyen.webdochoioto.model.UserDTO;
import com.sonnguyen.webdochoioto.service.UserService;
import com.sonnguyen.webdochoioto.validator.UserValidator;

@Controller
public class UserController {
	
	//private static Logger logger=Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserValidator userValidator;
	
	
	
	@RequestMapping("/danh-sach-nguoi-dung")
	public String viewAllUser(HttpServletRequest request) {
		//logger.info("Thong tin nguoi dung");
		request.setAttribute("users", userService.getAllUser());
		return "user/listUser";
	}
	
	@RequestMapping(value="/them-nguoi-dung",method=RequestMethod.GET)
	public String addUser(HttpServletRequest request) {
		request.setAttribute("user", new UserDTO());
		return "user/addUser";
	}
	
	@RequestMapping(value="/them-nguoi-dung",method=RequestMethod.POST)
	public String addUser(HttpServletRequest request,@ModelAttribute ("user") UserDTO userDTO,BindingResult bindingResult) {
		userValidator.validate(userDTO, bindingResult);
		if(bindingResult.hasErrors()) {
			return "user/addUser";
		}
		userService.insert(userDTO);
		return "redirect:/danh-sach-nguoi-dung";
	}
	
	@RequestMapping(value="/sua-nguoi-dung/{userId}",method=RequestMethod.GET)
	public String updateUser(HttpServletRequest request,@PathVariable ("userId") int id) {
		request.setAttribute("user", userService.getUserById(id));
		return "user/addUser";
	}
	
	@RequestMapping(value="/sua-nguoi-dung",method=RequestMethod.POST)
	public String updateUser(HttpServletRequest request,@ModelAttribute ("user") UserDTO userDTO,BindingResult bindingResult) {
		userValidator.validate(userDTO, bindingResult);
		if(bindingResult.hasErrors()) {
			return "user/addUser";
		}
		userService.update(userDTO);
		return "redirect:/danh-sach-nguoi-dung";
	}
	
	@RequestMapping(value="/xoa-nguoi-dung/{userId}",method=RequestMethod.GET)
	public String deleteUser(HttpServletRequest request,@PathVariable ("userId") int id) {
		userService.delete(id);
		return "redirect:/danh-sach-nguoi-dung";
	}
	
	
	@RequestMapping(value="/chi-tiet-nguoi-dung/{userId}",method=RequestMethod.GET)
	public String viewUser(HttpServletRequest request,@PathVariable ("userId") int id) {
		request.setAttribute("user", userService.getUserById(id));
		return "user/addUser";
	}
}
