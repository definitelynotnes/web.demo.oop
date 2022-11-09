package com.bootcamp.demo;

import javax.security.auth.login.AccountException;

import com.bootcamp.demo.domain.UserAccount;
import com.bootcamp.demo.service.AuthenticationService;

public class ApplicationTest {
	public static void main(String[] args) {
		try {
			UserAccount userAccount = new UserAccount("admin", "pass");
			AuthenticationService authenticationService = new AuthenticationService();
			authenticationService.authenticate(userAccount);
				System.out.println("Login success.");
			} catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
				
			} catch (AccountException e) {
				System.out.println(e.getMessage());
		}
	}
}
