package com.sonnguyen.webdochoioto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sonnguyen.webdochoioto.model.RoleDTO;

public class RoleMapper implements RowMapper<RoleDTO> {

	@Override
	public RoleDTO mapRow(ResultSet resultSet) {
		try {
			RoleDTO role = new RoleDTO();
			role.setCode(resultSet.getString("code"));
			role.setName(resultSet.getString("name"));
			return role;
		} catch (SQLException e) {
			return null;
		}
	}
}
