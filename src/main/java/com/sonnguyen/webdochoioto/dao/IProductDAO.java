package com.sonnguyen.webdochoioto.dao;

import java.util.List;

import com.sonnguyen.webdochoioto.model.ProductDTO;

public interface IProductDAO extends GenericDAO<ProductDTO>{
	public void insert(ProductDTO product);
	public void update(ProductDTO product);
	public void delete(Integer id);
	List<ProductDTO> findAll();
	ProductDTO findOne(Integer id);
	List<ProductDTO> findByCategoryId(Integer categoryId);
	List<ProductDTO> findByBrandId(Integer brandId);
}
