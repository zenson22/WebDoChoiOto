package com.sonnguyen.webdochoioto.controller.admin;

import java.util.List;

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
import com.sonnguyen.webdochoioto.service.IRoleService;
import com.sonnguyen.webdochoioto.service.IUserService;
import com.sonnguyen.webdochoioto.validator.UserValidator;

@RequestMapping(value="/quan-tri/nguoi-dung")
@Controller(value="controllerOfUser")
public class UserController {
	
	@Autowired 
	private IUserService userService;
	
	@Autowired
	private UserValidator userValidator;
	
	@Autowired
	private IRoleService roleService;
	
	@RequestMapping("")
	public String viewAllUser(HttpServletRequest request) {
		
		List<UserDTO> users =userService.findAll();
		for (UserDTO user : users) {
			user.setRoleId(roleService.findOne(user.getId()).getCode());
		}
		request.setAttribute("users", users);
		return "admin/account_manager";
	}
	
	
	@RequestMapping(value="/add-account",method=RequestMethod.GET)
	public String addUser() {
		return "admin/account_insert";
	}
	
	@RequestMapping(value="/add-account",method=RequestMethod.POST)
	public String addUser(HttpServletRequest request,@ModelAttribute ("user") UserDTO userDTO,BindingResult bindingResult) {
		userValidator.validate(userDTO, bindingResult);
		if(bindingResult.hasErrors()) {
			return "admin/account_insert";
		}
		userService.insert(userDTO);
		return "redirect:/quan-tri/nguoi-dung";
	}
	
	@RequestMapping(value="/update-account/{userId}",method=RequestMethod.GET)
	public String updateUser(HttpServletRequest request,@PathVariable ("userId") Integer id) {
		UserDTO user =userService.findOne(id);
		user.setRoleId(roleService.findOne(user.getId()).getCode());
		request.setAttribute("user", user );
		return "admin/account_edit";
	}
	
	@RequestMapping(value="/update-account",method=RequestMethod.POST)
	public String updateUser(HttpServletRequest request,@ModelAttribute ("user") UserDTO userDTO,BindingResult bindingResult) {
		userValidator.validate(userDTO, bindingResult);
		if(bindingResult.hasErrors()) {
			return "admin/account_edit";
		}
		userService.update(userDTO);
		return "redirect:/quan-tri/nguoi-dung";
	}
	
	@RequestMapping(value="/delete-account/{userId}",method=RequestMethod.GET)
	public String deleteUser(HttpServletRequest request,@PathVariable ("userId") Integer id) {
		userService.delete(id);
		return "redirect:/quan-tri/nguoi-dung";
	}

}
