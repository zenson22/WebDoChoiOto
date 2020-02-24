package com.sonnguyen.webdochoioto.dao;

import java.util.List;

import com.sonnguyen.webdochoioto.entity.Users;

public interface IUserDAO {
	public void insert(Users user);
	public void update(Users user);
	public void delete(Integer id);
	public Users getUserById(Integer id);
	public List<Users> getAllUser();
	public Users findOneByUsernameAndStatus(String username, boolean status);
}
