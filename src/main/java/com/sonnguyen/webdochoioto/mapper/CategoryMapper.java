package com.sonnguyen.webdochoioto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sonnguyen.webdochoioto.model.CategoryDTO;

public class CategoryMapper implements RowMapper<CategoryDTO> {

	@Override
	public CategoryDTO mapRow(ResultSet resultSet) {
		try {
			CategoryDTO category = new CategoryDTO();
			category.setId(resultSet.getInt("id"));
			category.setName(resultSet.getString("name"));
			return category;
		} catch (SQLException e) {
			return null;
		}
	}
}
