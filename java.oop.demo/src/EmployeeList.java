
public class EmployeeList {
	Employee[] employees;

	// 1. Class Name == Constructor Name
	// 2. Constructor does not have return
	// 3. Invoked every time an instance is created
	// 4. Invoked once (implicit)
	public EmployeeList(int size) {
		employees = new Employee[size];
	}

	public int count() {
		return employees.length;
	}

	public Employee find(int id) {
		Employee employee = null;
		for (Employee e : employees) {
			if (id == e.id) {
				employee = e;
				break;
			}
		}
		return employee;
	}

	public void add(int index, Employee e) {
		employees[index] = e;
	}

	public Employee[] findAll() {
		return employees;
	}

	public Employee findByIndex(int index) {
		if (!(index >= 0 && index < count())) {
			throw new IllegalArgumentException("Invalid index value");
		}
		return employees[index];
	}

}
