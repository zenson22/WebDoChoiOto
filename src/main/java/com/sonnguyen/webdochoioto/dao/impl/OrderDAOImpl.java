package com.sonnguyen.webdochoioto.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sonnguyen.webdochoioto.dao.IOrderDAO;
import com.sonnguyen.webdochoioto.mapper.OrderMapper;
import com.sonnguyen.webdochoioto.model.OrderDTO;


@Component
public class OrderDAOImpl extends AbstractDAO<OrderDTO> implements IOrderDAO{

	@Override
	public List<OrderDTO> findAll() {
		String sql = "SELECT * FROM ORDERS";
		return query(sql, new OrderMapper());
	}

	@Override
	public OrderDTO findOne(Integer id) {
		String sql = "SELECT * FROM ORDERS WHERE ID = ?";
		List<OrderDTO> product = query(sql, new OrderMapper(), id);
		return product.isEmpty() ? null : product.get(0);	
	}

	@Override
	public List<OrderDTO> findByUserId(Integer userId) {
		String sql = "SELECT * FROM ORDERS WHERE USERS_ID = ?";
		List<OrderDTO> orders = query(sql, new OrderMapper(), userId);
		return orders.isEmpty() ? null : orders;
	}

	@Override
	public void insert(OrderDTO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(OrderDTO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(OrderDTO id) {
		// TODO Auto-generated method stub
		
	}

}
