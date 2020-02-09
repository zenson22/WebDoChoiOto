package com.sonnguyen.webdochoioto.dao;

import java.util.List;

import com.sonnguyen.webdochoioto.entity.User;

public interface UserDAO {
	public void insert(User user);
	public void update(User user);
	public void delete(int id);
	public User getUserById(int id);
	public List<User> getAllUser();
}
