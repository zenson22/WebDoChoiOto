package com.sonnguyen.webdochoioto.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestUserController {
	
	/*@Autowired
	private IUserService userService;
	
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
	}*/
}
