package com.sonnguyen.webdochoioto.dao;

import java.util.List;

import com.sonnguyen.webdochoioto.model.BrandDTO;

public interface IBrandDAO extends GenericDAO<BrandDTO> {
	List<BrandDTO> findAll();
	BrandDTO findOne(Integer id);
	void insert(BrandDTO brand);
	void update(BrandDTO brand);
	void delete(Integer id);
}
