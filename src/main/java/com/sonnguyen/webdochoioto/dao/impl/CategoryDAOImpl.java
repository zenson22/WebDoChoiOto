package com.sonnguyen.webdochoioto.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sonnguyen.webdochoioto.dao.ICategoryDAO;
import com.sonnguyen.webdochoioto.mapper.CategoryMapper;
import com.sonnguyen.webdochoioto.model.CategoryDTO;


@Component
public class CategoryDAOImpl extends AbstractDAO<CategoryDTO> implements ICategoryDAO {

	@Override
	public List<CategoryDTO> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}

	@Override
	public CategoryDTO findOne(Integer id) {
		String sql = "SELECT * FROM category WHERE id = ?";
		List<CategoryDTO> category = query(sql, new CategoryMapper(), id);
		return category.isEmpty() ? null : category.get(0);
	}

    @Override
    public CategoryDTO findOneByCode(String code) {
		String sql = "SELECT * FROM category WHERE code = ?";
		List<CategoryDTO> category = query(sql, new CategoryMapper(), code);
		return category.isEmpty() ? null : category.get(0);
    }

}
