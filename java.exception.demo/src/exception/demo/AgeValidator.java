package exception.demo;

import java.util.Scanner;

public class AgeValidator {
	
	public static final int MINIMUM_AGE = 18;
	public static final int MAXIMUM_AGE = 65;
	
	public static boolean isValid(int age) /* throws IllegalArgumentException */{
		if (age < 1) {
/*			IllegalArgumentException e = new IllegalArgumentException("invalid age");
			throw e;
*/
			throw new IllegalArgumentException("Invalid age");
		}
		
		return age >= MINIMUM_AGE && age <= MAXIMUM_AGE;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = in.nextInt();
		
		try {
			if(isValid(age)) {
				System.out.println("Valid age: " + age);
			} else {
				System.out.println("Invalid age" + age);
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
