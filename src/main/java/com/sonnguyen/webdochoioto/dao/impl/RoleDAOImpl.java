package com.sonnguyen.webdochoioto.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sonnguyen.webdochoioto.dao.IRoleDAO;
import com.sonnguyen.webdochoioto.mapper.RoleMapper;
import com.sonnguyen.webdochoioto.model.RoleDTO;


@Component
public class RoleDAOImpl extends AbstractDAO<RoleDTO> implements IRoleDAO{

	
	@Override
	public RoleDTO findOne(Integer id) {
		String sql = "SELECT * FROM ROLE AS R JOIN USER_ROLE AS UR ON R.CODE = UR.ROLE_ID WHERE UR.USER_ID = ?";;
		List<RoleDTO> role = query(sql, new RoleMapper(), id);
		return role.isEmpty() ? null : role.get(0);	
	}

	@Override
	public void insert(RoleDTO product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(RoleDTO product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RoleDTO> findAll() {
		String sql = "SELECT * FROM ROLE";
		List<RoleDTO> roles = query(sql, new RoleMapper());
		return roles;
	}


}
