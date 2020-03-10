package com.sonnguyen.webdochoioto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonnguyen.webdochoioto.dao.IOrderDAO;
import com.sonnguyen.webdochoioto.model.OrderDTO;
import com.sonnguyen.webdochoioto.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService{

	@Autowired
	private IOrderDAO orderDao;
	
	@Override
	public List<OrderDTO> findAll() {
		return orderDao.findAll();
	}

	@Override
	public OrderDTO findOne(Integer id) {
		return orderDao.findOne(id);
	}

	@Override
	public List<OrderDTO> findByUserId(Integer userId) {
		return orderDao.findByUserId(userId);
	}

	@Override
	public void insert(OrderDTO order) {
		orderDao.insert(order);
	}

	@Override
	public void update(OrderDTO order) {
		orderDao.update(order);
	}

	@Override
	public void delete(Integer id) {
		orderDao.delete(id);
	}

	@Override
	public void deleteProductOrderDetails(Integer orderId, Integer productId) {
		orderDao.deleteProductOrderDetails(orderId, productId);
	}

	@Override
	public List<OrderDTO> findProductOrderDetailsByUserId(Integer userId) {
		return orderDao.findProductOrderDetailsByUserId(userId);
	}

	@Override
	public OrderDTO findProductOrderDetailsOne(Integer orderId, Integer productId) {
		return orderDao.findProductOrderDetailsOne(orderId, productId);
	}

	@Override
	public List<OrderDTO> findAllOrderDetails() {
		return orderDao.findAllOrderDetails();
	}

	@Override
	public List<OrderDTO> findOneOrderDetails(Integer id) {
		return orderDao.findOneOrderDetails(id);
	}

	@Override
	public void deleteOrderDetail(Integer id) {
		orderDao.deleteOrderDetail(id);
		
	}

}
