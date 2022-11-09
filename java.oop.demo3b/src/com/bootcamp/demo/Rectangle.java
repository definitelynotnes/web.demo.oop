package com.bootcamp.demo;

public class Rectangle extends BaseShape implements Shape{
	private double height;
	private double width;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void computeArea() {
		this.area = width * height;
		
	}
}
