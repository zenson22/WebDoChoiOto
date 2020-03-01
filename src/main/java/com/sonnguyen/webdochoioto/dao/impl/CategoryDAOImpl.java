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
    public CategoryDTO findOneByName(String name) {
		String sql = "SELECT * FROM category WHERE name = ?";
		List<CategoryDTO> category = query(sql, new CategoryMapper(), name);
		return category.isEmpty() ? null : category.get(0);
    }

	@Override
	public void insert(CategoryDTO category) {
		String sql = "INSERT INTO Category(name) VALUES(?)";
		insert(sql,category.getName() );
	}

	@Override
	public void update(CategoryDTO category) {
		String sql = "UPDATE CATEGORY SET NAME = ? WHERE id = ?";
		update(sql ,category.getName() , category.getId());
	}

	@Override
	public void delete(Integer id) {
		String sql =" DELETE FROM CATEGORY WHERE ID = ?";
		update(sql,id);
	}

}
