package com.sonnguyen.webdochoioto.model;

import java.sql.Date;

public class OrderDTO extends AbstractModel<OrderDTO>{
		private UserDTO users;
		private byte[] status;
		private Date orderDate;
		private int totalPrice;
		public UserDTO getUsers() {
			return users;
		}
		public void setUsers(UserDTO users) {
			this.users = users;
		}
		public byte[] getStatus() {
			return status;
		}
		public void setStatus(byte[] status) {
			this.status = status;
		}
		public Date getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}
		public int getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
		}
		

}
