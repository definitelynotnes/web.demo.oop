
public class Student {
	// instance variables
	int id; // 0 default value
	String firstName; // null so long as it is not a primitive data type
	String lastName; // null
	int age;		 //0
	int gradeLevel;	 //0
	boolean isEnrolled; // false if boolean and u000 if char
	
	public void setStudentDetails() {
		id = 100;
		firstName = "John";
		lastName = "Doe";
		age = 13;
		gradeLevel = 8;
	}
	
	public void displayDetails() {
		//local variables
		String schoolName = "XYZ HS";
		System.out.println("School: " + schoolName);
		System.out.println("Student ID: " + id);
		System.out.println("Full Name: " + lastName + ", " + firstName);
		System.out.println("Age: " + age);
		System.out.println("Grade Level: " + gradeLevel);
		String enrollmentStatus = (isEnrolled ? "Yes" : "No");
		System.out.println("Enrolled? " + enrollmentStatus);
	}
	

	}

