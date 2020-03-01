package com.sonnguyen.webdochoioto.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sonnguyen.webdochoioto.dao.IProductDAO;
import com.sonnguyen.webdochoioto.model.ProductDTO;
import com.sonnguyen.webdochoioto.service.IProductService;

@Service
@Transactional
public class ProductServiceImpl implements IProductService{

	@Autowired
	private IProductDAO productDao;
	
	@Override
	public List<ProductDTO> findAll() {
		return productDao.findAll();
	}

	@Override
	public void insert(ProductDTO productDto) {
		productDao.insert(productDto);
	}

	@Override
	public void update(ProductDTO productDto) {
		productDao.update(productDto);
	}

	@Override
	public void delete(Integer productId) {
		productDao.delete(productId);
	}

	@Override
	public ProductDTO findOne(Integer id) {
		return productDao.findOne(id);
	}

}
