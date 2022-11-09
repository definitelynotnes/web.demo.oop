package com.bootcamp.demo.service;

import javax.security.auth.login.AccountException;

import com.bootcamp.demo.domain.UserAccount;
import com.bootcamp.demo.util.StringUtil;

public class AuthenticationService {
	public void authenticate(UserAccount userAccount) throws AccountException {
		if(userAccount == null) {
			throw new IllegalArgumentException("User account cannot be null.");
		}
		
		if(StringUtil.isNullOrEmpty(userAccount.getUsername())) {
			throw new IllegalArgumentException("Username is required");
		}
		
		if(StringUtil.isNullOrEmpty(userAccount.getPassword())){
			throw new IllegalArgumentException("Password is required");
		}
		
		if(!(userAccount.getUsername().equals("admin") )) {
			throw new AccountException("Invalid username");
		}
		if(!(userAccount.getPassword().equals("pass"))) {
			throw new AccountException("Invalid password");
		}
	}
}
