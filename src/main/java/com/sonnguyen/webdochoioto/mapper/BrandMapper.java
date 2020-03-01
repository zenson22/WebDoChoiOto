package com.sonnguyen.webdochoioto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sonnguyen.webdochoioto.model.BrandDTO;

public class BrandMapper implements RowMapper<BrandDTO> {

	@Override
	public BrandDTO mapRow(ResultSet resultSet) {
		try {
			BrandDTO brand = new BrandDTO();
			brand.setId(resultSet.getInt("id"));
			brand.setName(resultSet.getString("name"));
			return brand;
		} catch (SQLException e) {
			return null;
		}
	}
}
