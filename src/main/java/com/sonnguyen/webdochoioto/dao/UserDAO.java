package com.sonnguyen.webdochoioto.dao;

import java.util.List;

import com.sonnguyen.webdochoioto.entity.User;

public interface UserDAO {
	public void insert(User user);
	public void update(User user);
	public void delete(Long id);
	public User getUserById(Long id);
	public List<User> getAllUser();
}
