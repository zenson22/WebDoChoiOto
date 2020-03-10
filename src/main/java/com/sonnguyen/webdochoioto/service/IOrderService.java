package com.sonnguyen.webdochoioto.service;

import java.util.List;

import com.sonnguyen.webdochoioto.model.OrderDTO;

public interface IOrderService {
	List<OrderDTO> findAll();
	OrderDTO findOne(Integer id);
	List<OrderDTO> findByUserId(Integer userId);
	public void insert(OrderDTO order);
	public void update(OrderDTO order);
	public void delete(Integer id);
	public void deleteProductOrderDetails(Integer orderId,Integer productId);
	List<OrderDTO> findProductOrderDetailsByUserId(Integer userId);
	OrderDTO findProductOrderDetailsOne(Integer orderId,Integer productId);
	List<OrderDTO> findAllOrderDetails();
	List<OrderDTO> findOneOrderDetails(Integer id);
	public void deleteOrderDetail(Integer id);
}
