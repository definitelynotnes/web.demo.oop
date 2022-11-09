
public class EmployeeFormTest {
	public static void main(String[] args) {
		EmployeeList employeeList = new EmployeeList(10);
		EmployeeForm employeeForm = new EmployeeForm();

		for (int index = 0; index < employeeList.count(); index++) {
			Employee newEmployee = employeeForm.read();
			employeeList.add(index, newEmployee);
		}

		// refactor
		for (int index = 0; index < employeeList.count(); index++) {
			// employeeForm.display(employeeList.findAll()[index]);
			Employee existingEmployee = employeeList.findByIndex(index);
			employeeForm.display(existingEmployee);
		}
	}
}
