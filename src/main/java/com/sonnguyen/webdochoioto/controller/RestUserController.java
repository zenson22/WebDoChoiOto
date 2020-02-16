package com.sonnguyen.webdochoioto.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sonnguyen.webdochoioto.model.UserDTO;
import com.sonnguyen.webdochoioto.service.UserService;

@RestController
public class RestUserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list-user")
	public  List<UserDTO> getAllUser() {
		List<UserDTO>  listUser=userService.getAllUser();
		return listUser;
	}
	
	@RequestMapping(value="/user/{userId}",method=RequestMethod.GET)
	public  UserDTO viewOneUser(HttpServletRequest request,@PathVariable ("userId") Integer id) {
		return userService.getUserById(id);
	}
	
	@RequestMapping(value="/add-user",method=RequestMethod.POST)
	@ResponseStatus(code=HttpStatus.CREATED)
	public  void addUser(@RequestBody  UserDTO userDTO) {
		userService.insert(userDTO);
	}
}
