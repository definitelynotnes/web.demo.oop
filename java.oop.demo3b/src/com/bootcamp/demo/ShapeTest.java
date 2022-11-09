package com.bootcamp.demo;

public class ShapeTest {

	public static void main(String[] args) {
		Shape circle = new Circle(5); // Shape reference means yung mga methods lang sa shape interface ang pwede tawagin.
		circle.computeArea();		  // implementation ng virtual methods is for encapsulation. to hide and only execute yung similar sa mga instances.
		circle.displayArea();
		
		Shape square = new Square(7); 
		square.computeArea();
		square.displayArea();
		
		Shape rectangle = new Rectangle(4, 2);
		rectangle.computeArea();
		rectangle.displayArea();

	}

}
