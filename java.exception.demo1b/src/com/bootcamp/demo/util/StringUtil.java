package com.bootcamp.demo.util;

public class StringUtil {
	public static boolean isNullOrEmpty(String value) {
		return value == null || value.trim().equals("");
	}
}
