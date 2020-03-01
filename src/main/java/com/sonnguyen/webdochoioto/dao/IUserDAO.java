package com.sonnguyen.webdochoioto.dao;

import java.util.List;

import com.sonnguyen.webdochoioto.model.UserDTO;

public interface IUserDAO {
	public void insert(UserDTO user);
	public void update(UserDTO user);
	public void delete(Integer id);
	public List<UserDTO> findAll();
	public UserDTO findOne(Integer id);
}
