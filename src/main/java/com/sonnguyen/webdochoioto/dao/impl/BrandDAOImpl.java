package com.sonnguyen.webdochoioto.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sonnguyen.webdochoioto.dao.IBrandDAO;
import com.sonnguyen.webdochoioto.mapper.BrandMapper;
import com.sonnguyen.webdochoioto.model.BrandDTO;


@Component
public class BrandDAOImpl extends AbstractDAO<BrandDTO> implements IBrandDAO {

	@Override
	public List<BrandDTO> findAll() {
		String sql = "SELECT * FROM BRAND";
		return query(sql, new BrandMapper());
	}

	@Override
	public BrandDTO findOne(Integer id) {
		String sql = "SELECT * FROM BRAND WHERE id = ?";
		List<BrandDTO> brand = query(sql, new BrandMapper(), id);
		return brand.isEmpty() ? null : brand.get(0);
	}


	@Override
	public void insert(BrandDTO brand) {
		String sql = "INSERT INTO BRAND(name) VALUES(?)";
		insert(sql,brand.getName() );
	}

	@Override
	public void update(BrandDTO brand) {
		String sql = "UPDATE BRAND SET NAME = ? WHERE id = ?";
		update(sql ,brand.getName() , brand.getId());
	}

	@Override
	public void delete(Integer id) {
		String sql =" DELETE FROM BRAND WHERE ID = ?";
		update(sql,id);
	}

}
