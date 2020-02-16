package com.sonnguyen.webdochoioto.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sonnguyen.webdochoioto.dao.UserDAO;
import com.sonnguyen.webdochoioto.entity.Users;
import com.sonnguyen.webdochoioto.model.UserDTO;
import com.sonnguyen.webdochoioto.service.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDao;
	
	
	@Override
	public void insert(UserDTO userDTO) {
		Users user=new Users();
		user.setId(userDTO.getId());
		user.setUsername(userDTO.getUsername());
		user.setPhone(userDTO.getPhone());
		userDao.insert(user);
	}

	@Override
	public void update(UserDTO userDTO) {
		Users user=new Users();
		user.setId(userDTO.getId());
		user.setUsername(userDTO.getUsername());
		user.setPhone(userDTO.getPhone());
		userDao.update(user);
	}

	@Override
	public void delete(Integer id) {
		Users user=userDao.getUserById(id);
		if(user!=null) {
			userDao.delete(id);
		}
	}

	@Override
	public UserDTO getUserById(Integer id) {
		Users user=userDao.getUserById(id);
		UserDTO userDTO=new UserDTO();
		if(user!=null) {
			userDTO.setId(user.getId());
			userDTO.setUsername(user.getUsername());
			userDTO.setPhone(user.getPhone());
		}
		return userDTO;
	}

	@Override
	public List<UserDTO> getAllUser() {
		List<UserDTO> userDTOs=new ArrayList<UserDTO>();
		List<Users> users=userDao.getAllUser();
		for(Users user:users) {
			UserDTO userDTO=new UserDTO();
			userDTO.setId(user.getId());
			userDTO.setUsername(user.getUsername());
			userDTO.setPhone(user.getPhone());
			userDTOs.add(userDTO);
		}
		return userDTOs;
	}
	
}
