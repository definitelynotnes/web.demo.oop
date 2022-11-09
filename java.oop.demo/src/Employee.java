
public class Employee {
	int id;
	String firstName;
	String lastName;
	float salary;

	public Employee(int id, String firstName, String lastName, float salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
// Create a class design for E-Commerce Website
// log in
// register
// cart (add, update, remove)
// checkout
// payout method
// total price for each item inside cart (price*quantity)
// grand total
// some classes has same attributes but in two separate context. They must be considered as two entities.
// ex. Employee is person while Manager is also a person.
// ex. product sa loob ng cart vs product in catalogue