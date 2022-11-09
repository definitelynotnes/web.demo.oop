package oop.demo3c;

public interface EmployeeRepository extends Repository {
	void findByFirstName(String firstName);
	void findByLastName(String lastName);
	void updateSalary();
	void updateJob();
	
}
