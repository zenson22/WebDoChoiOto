package com.sonnguyen.webdochoioto.service;

import java.util.List;

import com.sonnguyen.webdochoioto.model.RoleDTO;

public interface IRoleService {
	RoleDTO findOne(Integer id);
	void insert(RoleDTO role);
	void update(RoleDTO role);
	void delete(Integer userId);
	List<RoleDTO> findAll();
}
