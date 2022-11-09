import java.util.Scanner;

public class EmployeeForm {
	Scanner in;

	public EmployeeForm() {
		in = new Scanner(System.in);
	}

	public Employee read() {
		System.out.print("ID: ");
		int id = in.nextInt();
		System.out.println("First Name: ");
		String firstName = in.next();
		System.out.println("Last Name: ");
		String lastName = in.next();
		System.out.println("Salary: ");
		float salary = in.nextFloat();

		Employee employee = new Employee(id, firstName, lastName, salary);
		employee.setId(id);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setSalary(salary);

		return employee;
	}

	public void display(Employee employee) {
		System.out.println("ID: " + employee.getId());
		System.out.println("First Name: " + employee.getFirstName());
		System.out.println("Last Name: " + employee.getLastName());
		System.out.println("Salary: " + employee.getSalary());
	}
}
