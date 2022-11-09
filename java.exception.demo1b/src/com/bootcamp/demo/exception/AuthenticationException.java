package com.bootcamp.demo.exception;

public class AuthenticationException extends Exception {
/*	private String errorCode*/
	public AuthenticationException() {
		super("Authentication Error"); // new exception
	}
	
	public AuthenticationException(String message/*, String errorCode*/) {
		super(message);
	}
	
	public AuthenticationException(Throwable t, String message) {
		super(message, t);
	}
}
