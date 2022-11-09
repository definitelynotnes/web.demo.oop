package com.bootcamp.demo.util;

public class StringValidator {
	public static boolean isNullOrEmpty(String value) {
		return value == null || value.trim().equals("");
	}
}
