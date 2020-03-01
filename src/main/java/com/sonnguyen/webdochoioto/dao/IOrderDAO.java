package com.sonnguyen.webdochoioto.dao;

import java.util.List;

import com.sonnguyen.webdochoioto.model.OrderDTO;

public interface IOrderDAO extends GenericDAO<OrderDTO>{
	List<OrderDTO> findAll();
	OrderDTO findOne(Integer id);
	List<OrderDTO> findByUserId(Integer userId);
	public void insert(OrderDTO user);
	public void update(OrderDTO user);
	public void delete(OrderDTO id);
}
