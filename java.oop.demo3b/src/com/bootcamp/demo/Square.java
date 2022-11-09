package com.bootcamp.demo;

public class Square extends BaseShape implements Shape{
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public void computeArea() {
		this.area = this.side * this.side;
	}
}
