package com.sonnguyen.webdochoioto.dao;

import java.util.List;

import com.sonnguyen.webdochoioto.model.CategoryDTO;

public interface ICategoryDAO extends GenericDAO<CategoryDTO> {
	List<CategoryDTO> findAll();
	CategoryDTO findOne(Integer id);
	CategoryDTO findOneByCode(String code);
}
