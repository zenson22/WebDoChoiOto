package com.sonnguyen.webdochoioto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sonnguyen.webdochoioto.dao.IRoleDAO;
import com.sonnguyen.webdochoioto.model.RoleDTO;
import com.sonnguyen.webdochoioto.service.IRoleService;

@Service
@Transactional
public class RoleServiceImpl implements IRoleService{

	@Autowired
	private IRoleDAO roleDao;

	@Override
	public RoleDTO findOne(Integer id) {
		return roleDao.findOne(id);
	}

	@Override
	public void insert(RoleDTO role) {
		roleDao.insert(role);
	}

	@Override
	public void update(RoleDTO role) {
		roleDao.update(role);
	}

	@Override
	public void delete(Integer userId) {
		roleDao.delete(userId);
	}

	@Override
	public List<RoleDTO> findAll() {
		// TODO Auto-generated method stub
		return roleDao.findAll();
	}
	
	
}
