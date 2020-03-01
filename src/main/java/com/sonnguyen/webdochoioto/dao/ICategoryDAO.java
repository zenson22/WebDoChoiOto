package com.sonnguyen.webdochoioto.dao;

import java.util.List;

import com.sonnguyen.webdochoioto.model.CategoryDTO;

public interface ICategoryDAO extends GenericDAO<CategoryDTO> {
	List<CategoryDTO> findAll();
	CategoryDTO findOne(Integer id);
	CategoryDTO findOneByName(String name);
	void insert(CategoryDTO category);
	void update(CategoryDTO category);
	void delete(Integer id);
}
