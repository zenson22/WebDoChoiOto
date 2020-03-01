package com.sonnguyen.webdochoioto.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sonnguyen.webdochoioto.dao.IProductDAO;
import com.sonnguyen.webdochoioto.mapper.ProductMapper;
import com.sonnguyen.webdochoioto.model.ProductDTO;


@Component
public class ProductDAOImpl extends AbstractDAO<ProductDTO> implements IProductDAO{

	@Override
	public List<ProductDTO> findAll() {
		String sql = "SELECT * FROM PRODUCT";
		return query(sql, new ProductMapper());
	}

	@Override
	public ProductDTO findOne(Integer id) {
		String sql = "SELECT * FROM PRODUCT WHERE PRODUCT_ID = ?";
		List<ProductDTO> product = query(sql, new ProductMapper(), id);
		return product.isEmpty() ? null : product.get(0);	
	}

	@Override
	public List<ProductDTO> findByCategoryId(Integer categoryId) {
		String sql = "SELECT * FROM PRODUCT WHERE CATEGORY_ID = ?";
		List<ProductDTO> products = query(sql, new ProductMapper(), categoryId);
		return products.isEmpty() ? null : products;
	}
	
	@Override
	public List<ProductDTO> findByBrandId(Integer brandId) {
		String sql = "SELECT * FROM PRODUCT WHERE BRAND_ID = ?";
		List<ProductDTO> products = query(sql, new ProductMapper(), brandId);
		return products.isEmpty() ? null : products;
	}

	@Override
	public void insert(ProductDTO product) {
		String sql = "INSERT INTO PRODUCT(name, discount, description, brand_id, category_id, price, soLuong) VALUES(?,?,?,?,?,?,?)";
		insert(sql, product.getName(), product.getDiscount(),product.getDescription(),product.getBrandId()
				,product.getCategoryId(),product.getPrice(),product.getSoLuong());
	}

	@Override
	public void update(ProductDTO product) {
		String sql = "UPDATE PRODUCT SET name = ?, discount = ?, description = ?, brand_id = ?,category_id = ?,price = ?,soLuong = ? WHERE PRODUCT_ID = ?";
		update(sql, product.getName(), product.getDiscount(),product.getDescription(),product.getBrandId()
				,product.getCategoryId(),product.getPrice(),product.getSoLuong(),product.getId());
	}

	@Override
	public void delete(Integer id) {
		String sql = "DELETE FROM PRODUCT WHERE PRODUCT_ID = ?";
		update(sql, id);
	}

}
