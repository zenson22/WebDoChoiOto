package com.sonnguyen.webdochoioto.service;

import java.util.List;

import com.sonnguyen.webdochoioto.model.BrandDTO;

public interface IBrandService {
	List<BrandDTO> findAll();
	BrandDTO findOne(Integer id);
	void insert(BrandDTO brand);
	void update(BrandDTO brand);
	void delete(Integer id);
}
