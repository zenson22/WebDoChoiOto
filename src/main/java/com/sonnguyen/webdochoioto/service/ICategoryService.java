package com.sonnguyen.webdochoioto.service;

import java.util.List;

import com.sonnguyen.webdochoioto.model.CategoryDTO;

public interface ICategoryService {
	List<CategoryDTO> findAll();
}
