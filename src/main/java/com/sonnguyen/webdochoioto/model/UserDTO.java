package com.sonnguyen.webdochoioto.model;

import org.springframework.web.multipart.MultipartFile;

public class UserDTO {
	
	private String username;
	private String phone;
	private int id;
	private MultipartFile avatar;
	
	public MultipartFile getAvatar() {
		return avatar;
	}
	public void setAvatar(MultipartFile avatar) {
		this.avatar = avatar;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
