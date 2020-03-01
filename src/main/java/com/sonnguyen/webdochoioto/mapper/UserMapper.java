package com.sonnguyen.webdochoioto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sonnguyen.webdochoioto.model.UserDTO;

public class UserMapper implements RowMapper<UserDTO> {

	@Override
	public UserDTO mapRow(ResultSet resultSet) {
		try {
			UserDTO userDto = new UserDTO();
			userDto.setId(resultSet.getInt("id"));
			userDto.setAddress(resultSet.getString("address"));
			userDto.setUsername(resultSet.getString("username"));
			userDto.setFullName(resultSet.getString("fullname"));
			userDto.setPassword(resultSet.getString("password"));
			userDto.setEmail(resultSet.getString("email"));
			userDto.setStatus(resultSet.getInt("status"));
			userDto.setCreatedBy(resultSet.getString("created_by"));
			userDto.setCreatedDate(resultSet.getTimestamp("created_date"));
			userDto.setModifiedBy(resultSet.getString("modified_by"));
			userDto.setModifiedDate(resultSet.getTimestamp("modified_date"));
			userDto.setPhone(resultSet.getString("phone"));
			userDto.setAvatar(resultSet.getString("avatar"));
			userDto.setAge(resultSet.getInt("age"));
			return userDto;
		} catch (SQLException e) {
			return null;
		}
	}
}
