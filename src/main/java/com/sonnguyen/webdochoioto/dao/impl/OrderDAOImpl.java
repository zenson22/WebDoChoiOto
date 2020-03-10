package com.sonnguyen.webdochoioto.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sonnguyen.webdochoioto.dao.IOrderDAO;
import com.sonnguyen.webdochoioto.mapper.OrderMapper;
import com.sonnguyen.webdochoioto.mapper.ProductOrderDetailsMapper;
import com.sonnguyen.webdochoioto.model.OrderDTO;


@Component
public class OrderDAOImpl extends AbstractDAO<OrderDTO> implements IOrderDAO{

	@Override
	public List<OrderDTO> findAll() {
		String sql = "SELECT * FROM ORDERS;";
		return query(sql, new OrderMapper());
	}

	@Override
	public OrderDTO findOne(Integer id) {
		String sql = "SELECT * FROM ORDERS WHERE O.ID = ?";
		List<OrderDTO> orders = query(sql, new OrderMapper(), id);
		return orders.isEmpty() ? null : orders.get(0);	
	}

	@Override
	public List<OrderDTO> findByUserId(Integer orderId) {
		String sql = "SELECT * FROM ORDERS AS O JOIN product_orders_details AS POD ON O.id = POD.orders_id WHERE O.USERS_ID = ?";
		List<OrderDTO> orders = query(sql, new ProductOrderDetailsMapper(), orderId);
		return orders.isEmpty() ? null : orders;
	}

	@Override
	public void insert(OrderDTO order) {
		String sql = "INSERT INTO ORDERS(status, order_date, users_id) VALUES(?, ?, ?);";
		Long orderId = insert(sql, order.getStatus(),order.getOrderDate(),order.getUserId());
		String sqlInsertPOD = "INSERT INTO product_orders_details(orders_id, product_id, quantity) VALUES(?, ?, ?);" ;
		insert(sqlInsertPOD, orderId, order.getProductId(),order.getQuantity());
	}

	@Override
	public void update(OrderDTO order) {
		String sql = "UPDATE ORDERS SET status = ?, order_date = ? ,user_id = ? WHERE ID = ?";
		update(sql, order.getStatus(),order.getOrderDate(),order.getUserId(), order.getId());
		String sqlPod = "UPDATE product_orders_details SET Quantity = ?";
		update(sqlPod, order.getQuantity());
	}

	@Override
	public void delete(Integer id) {
		String sql =" DELETE FROM ORDERS WHERE ID = ?";
		update(sql, id);
	}

	@Override
	public void deleteProductOrderDetails(Integer orderId, Integer productId) {
		String sql =" DELETE FROM product_orders_details WHERE order_iD = ? AND product_id = ?";
		update(sql, orderId, productId);
	}

	@Override
	public List<OrderDTO> findProductOrderDetailsByUserId(Integer userId) {
		StringBuilder sql = new StringBuilder( "SELECT o.id,o.status, o.order_date ");
		sql.append(", o.total_price, o.users_id,product_id, quantity "); 
		sql.append(	"FROM PRODUCT_ORDERS_DETAILS as pod join Orders as o on o.id =pod.orders_id  WHERE o.USERS_ID = ?");
		List<OrderDTO> orders = query(sql.toString(), new ProductOrderDetailsMapper(), userId);
		return orders.isEmpty() ? null : orders;
	}

	@Override
	public OrderDTO findProductOrderDetailsOne(Integer orderId, Integer productId) {
		StringBuilder sql = new StringBuilder( "SELECT o.id,o.status, o.order_date , o.total_price, o.users_id,product_id, quantity "); 
		sql.append(	"FROM PRODUCT_ORDERS_DETAILS as pod join Orders as o on o.id =pod.orders_id  WHERE pod.orders_id = ? AND pod.product_id= ?");
		List<OrderDTO> orders = query(sql.toString(), new ProductOrderDetailsMapper(), orderId,productId);
		return orders.isEmpty() ? null : orders.get(0);
	}

	@Override
	public List<OrderDTO> findAllOrderDetails() {
		String sql = "SELECT * FROM ORDERS AS O JOIN product_orders_details AS POD ON O.id = POD.orders_id;";
		return query(sql, new ProductOrderDetailsMapper());
	}

	@Override
	public List<OrderDTO> findOneOrderDetails(Integer id) {
		String sql = "SELECT * FROM ORDERS AS O JOIN product_orders_details AS POD ON O.id = POD.orders_id WHERE O.ID = ?";
		List<OrderDTO> orders = query(sql, new ProductOrderDetailsMapper(), id);
		return orders.isEmpty() ? null : orders;	
	}

	@Override
	public void deleteOrderDetail(Integer id) {
		String sql =" DELETE FROM product_orders_details WHERE ORDERS_ID = ?";
		update(sql, id);
	}
}
