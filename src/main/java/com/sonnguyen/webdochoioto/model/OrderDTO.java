package com.sonnguyen.webdochoioto.model;

import java.sql.Date;

public class OrderDTO extends AbstractModel<OrderDTO>{
		private Integer userId;
		private Integer status;
		private Date orderDate;
		private int totalPrice;
		private int quantity;
		private Integer productId;
		private ProductDTO product;
		private UserDTO user;
		private int payment;
		private String address;
		public Integer getUserId() {
			return userId;
		}
		public void setUsers(int id) {
			this.userId = id;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
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
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public Integer getProductId() {
			return productId;
		}
		public void setProductId(Integer productId) {
			this.productId = productId;
		}
		public ProductDTO getProduct() {
			return product;
		}
		public void setProduct(ProductDTO product) {
			this.product = product;
		}
		public UserDTO getUser() {
			return user;
		}
		public void setUser(UserDTO user) {
			this.user = user;
		}
		public int getPayment() {
			return payment;
		}
		public void setPayment(int payment) {
			this.payment = payment;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		

}
