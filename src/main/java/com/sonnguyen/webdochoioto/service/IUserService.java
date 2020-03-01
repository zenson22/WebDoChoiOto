package com.sonnguyen.webdochoioto.service;

import java.util.List;

import com.sonnguyen.webdochoioto.model.UserDTO;

public interface IUserService {
	List<UserDTO> findAll();
	void insert(UserDTO userDto);
	void update(UserDTO userDto);
	void delete(Integer userId);
	UserDTO findOne(Integer id);
}
