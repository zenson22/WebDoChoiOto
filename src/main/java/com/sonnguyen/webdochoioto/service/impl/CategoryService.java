package com.sonnguyen.webdochoioto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonnguyen.webdochoioto.dao.ICategoryDAO;
import com.sonnguyen.webdochoioto.model.CategoryDTO;
import com.sonnguyen.webdochoioto.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService {

	@Autowired
	private ICategoryDAO categoryDao;

	@Override
	public List<CategoryDTO> findAll() {
		return categoryDao.findAll();
	}

	@Override
	public CategoryDTO findOne(Integer id) {
		return categoryDao.findOne(id);
	}

	@Override
	public CategoryDTO findOneByName(String name) {
		return categoryDao.findOneByName(name);
	}

	@Override
	public void insert(CategoryDTO category) {
		categoryDao.insert(category);
	}

	@Override
	public void update(CategoryDTO category) {
		categoryDao.update(category);
	}

	@Override
	public void delete(Integer id) {
		categoryDao.delete(id);
	}
}
