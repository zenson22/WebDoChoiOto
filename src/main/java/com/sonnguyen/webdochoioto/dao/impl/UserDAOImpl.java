package com.sonnguyen.webdochoioto.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sonnguyen.webdochoioto.dao.IUserDAO;
import com.sonnguyen.webdochoioto.mapper.UserMapper;
import com.sonnguyen.webdochoioto.model.UserDTO;
import com.sonnguyen.webdochoioto.util.SecurityUtils;


@Component
public class UserDAOImpl extends AbstractDAO<UserDTO> implements IUserDAO{

	
	@Override
	public void insert(UserDTO user) {
		user.setCreatedBy(SecurityUtils.getPrincipal().getUsername());
		user.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		StringBuilder sql = new StringBuilder("INSERT INTO USER(username, email, password, created_date,  ");
		sql.append("  phone, address, fullName, created_by, age, status) ");
		sql.append("  VALUES(? ,? ,? ,?, ? ,? ,? ,? ,? ,? );");
		Long id = insert(sql.toString(), user.getUsername(),  user.getEmail(), user.getPassword(), user.getCreatedDate(), user.getPhone()
			, user.getAddress(), user.getFullName(), user.getCreatedBy()
				, user.getAge(), user.getStatus());
		String sqlUserRole = "UPDATE USER_ROLE SET ROLE_ID = ? WHERE USER_ID = ?;";
		update(sqlUserRole,user.getRoleId(),id);
	}

	@Override
	public void update(UserDTO user) {
		user.setModifiedBy(SecurityUtils.getPrincipal().getUsername());
		user.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		StringBuilder sql = new StringBuilder("UPDATE USER SET username = ? , email = ?, password = ?, modified_date = ?,  ");
		sql.append("  phone = ?, address = ? , fullName = ?, modified_by =?, age =?, status =?  ");
		sql.append("  WHERE ID = ?;");
		update(sql.toString(), user.getUsername(),  user.getEmail(), user.getPassword(), user.getModifiedDate(), user.getPhone()
				, user.getAddress(), user.getFullName(), user.getModifiedBy()
				, user.getAge(), user.getStatus(), user.getId());
		String sqlUserRole = "UPDATE USER_ROLE SET ROLE_ID = ? WHERE USER_ID = ?;";
		update(sqlUserRole,user.getRoleId(),user.getId());
	}

	@Override
	public void delete(Integer id) {
		String sql = "DELETE FROM USER WHERE ID = ?;";
		update(sql, id);
	}

	@Override
	public List<UserDTO> findAll() {
		String sql = "SELECT * FROM USER;";
		return query(sql,new  UserMapper());
	}

	@Override
	public UserDTO findOne(Integer id) {
		String sql = "SELECT * FROM USER WHERE ID = ?";
		List<UserDTO> users = query(sql,new  UserMapper(),id);
		return users.isEmpty()? null : users.get(0) ;
	}

}
