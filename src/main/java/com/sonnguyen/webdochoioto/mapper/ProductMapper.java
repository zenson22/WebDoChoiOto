package com.sonnguyen.webdochoioto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sonnguyen.webdochoioto.model.ProductDTO;

public class ProductMapper implements RowMapper<ProductDTO> {

	@Override
	public ProductDTO mapRow(ResultSet resultSet) {
		try {
			ProductDTO product = new ProductDTO();
			product.setId(resultSet.getInt("product_id"));
			product.setPrice(resultSet.getLong("price"));
			product.setName(resultSet.getString("name"));
			product.setDiscount(resultSet.getFloat("discount"));
			product.setDescription(resultSet.getString("description"));
			product.setBrandId(resultSet.getLong("brand_id"));
			product.setCategoryId(resultSet.getLong("category_id"));
			product.setSoLuong(resultSet.getInt("soLuong"));
			return product;
		} catch (SQLException e) {
			return null;
		}
	}
}
