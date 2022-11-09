package com.bootcamp.demo;

public class Circle extends BaseShape implements Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public void computeArea() {
		this.area = 3.14D * this.radius * this.radius;
		
	}
}
