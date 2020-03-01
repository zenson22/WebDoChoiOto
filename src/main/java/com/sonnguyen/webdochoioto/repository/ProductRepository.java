package com.sonnguyen.webdochoioto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonnguyen.webdochoioto.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<Product> findAll();
	List<Product> findByCategoryId(Integer id);
}
