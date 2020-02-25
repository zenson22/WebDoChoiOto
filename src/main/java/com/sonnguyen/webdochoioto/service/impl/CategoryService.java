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
}
