package com.bootcamp.demo;

public abstract class BaseShape {
	protected double area;
	protected String color;
	
	public void displayArea() {
		System.out.println(String.format("Area: %s", this.area));
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
