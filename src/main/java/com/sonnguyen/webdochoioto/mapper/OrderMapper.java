package com.sonnguyen.webdochoioto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sonnguyen.webdochoioto.model.OrderDTO;

public class OrderMapper implements RowMapper<OrderDTO> {

	@Override
	public OrderDTO mapRow(ResultSet resultSet) {
		try {
			OrderDTO order = new OrderDTO();
			order.setId(resultSet.getInt("id"));
			order.setStatus(resultSet.getInt("status"));
			order.setOrderDate(resultSet.getDate("order_date"));
			order.setTotalPrice(resultSet.getInt("total_price"));
			order.setUsers(resultSet.getInt("users_id"));
			return order;
		} catch (SQLException e) {
			return null;
		}
	}
}
