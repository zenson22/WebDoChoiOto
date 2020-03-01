package com.sonnguyen.webdochoioto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonnguyen.webdochoioto.dao.IBrandDAO;
import com.sonnguyen.webdochoioto.model.BrandDTO;
import com.sonnguyen.webdochoioto.service.IBrandService;

@Service
public class BrandService implements IBrandService {

	@Autowired
	private IBrandDAO brandDao;

	@Override
	public List<BrandDTO> findAll() {
		return brandDao.findAll();
	}

	@Override
	public BrandDTO findOne(Integer id) {
		return brandDao.findOne(id);
	}


	@Override
	public void insert(BrandDTO brand) {
		brandDao.insert(brand);
	}

	@Override
	public void update(BrandDTO brand) {
		brandDao.update(brand);
	}

	@Override
	public void delete(Integer id) {
		brandDao.delete(id);
	}
}
