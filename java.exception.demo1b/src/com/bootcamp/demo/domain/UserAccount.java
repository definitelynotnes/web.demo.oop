package com.bootcamp.demo.domain;

import com.bootcamp.demo.util.StringUtil;

public class UserAccount {
	private String username;
	private String password;
	
	public UserAccount() {
		// TODO Auto-generated constructor stub
	}

	public UserAccount(String username, String password) {
		setUsername(username);
		setPassword(password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if(StringUtil.isNullOrEmpty(username)) {
			throw new IllegalArgumentException("Username cannot be null or empty");
		}
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(StringUtil.isNullOrEmpty(password)) {
			throw new IllegalArgumentException("Password cannot be null or empty");
		}
		this.password = password;
	}
	
	
}
