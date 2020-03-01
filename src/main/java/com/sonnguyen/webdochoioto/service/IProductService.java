package com.sonnguyen.webdochoioto.service;

import java.util.List;

import com.sonnguyen.webdochoioto.model.ProductDTO;

public interface IProductService {
	List<ProductDTO> findAll();
	void insert(ProductDTO productDto);
	void update(ProductDTO productDto);
	void delete(Integer productId);
	ProductDTO findOne(Integer id);
}
