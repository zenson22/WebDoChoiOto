package com.sonnguyen.webdochoioto.service;

import java.util.List;

import com.sonnguyen.webdochoioto.model.UserDTO;

public interface UserService {
	public void insert(UserDTO user);
	public void update(UserDTO user);
	public void delete(Integer id);
	public UserDTO getUserById(Integer id);
	public List<UserDTO> getAllUser();
}
