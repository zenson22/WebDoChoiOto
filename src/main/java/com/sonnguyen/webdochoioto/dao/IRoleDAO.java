package com.sonnguyen.webdochoioto.dao;

import java.util.List;

import com.sonnguyen.webdochoioto.model.RoleDTO;

public interface IRoleDAO extends GenericDAO<RoleDTO>{
	public void insert(RoleDTO product);
	public void update(RoleDTO product);
	public void delete(Integer id);
	RoleDTO findOne(Integer userId);
	List<RoleDTO> findAll();
}
