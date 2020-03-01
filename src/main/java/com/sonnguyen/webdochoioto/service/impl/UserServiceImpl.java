package com.sonnguyen.webdochoioto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sonnguyen.webdochoioto.dao.IUserDAO;
import com.sonnguyen.webdochoioto.model.UserDTO;
import com.sonnguyen.webdochoioto.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDAO userDao;
	
	
	@Override
	public List<UserDTO> findAll() {
		return userDao.findAll();
	}

	@Override
	public void insert(UserDTO userDto) {
		userDao.insert(userDto);
	}

	@Override
	public void update(UserDTO userDto) {
		userDao.update(userDto);
	}

	@Override
	public void delete(Integer userId) {
		userDao.delete(userId);
	}

	@Override
	public UserDTO findOne(Integer id) {
		return userDao.findOne(id);
	}

}
