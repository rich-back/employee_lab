package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Department;
import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.models.Project;
import com.codeclan.example.employeeservice.repositories.DepartmentRepository;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import com.codeclan.example.employeeservice.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee() {
		Department department = new Department("Tech");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Billy", 45, 2, "billy69@yahoo.co.uk", department);
		Employee employee2 = new Employee("Bob", 23, 3, "bob69@yahoo.co.uk", department);
		Employee employee3 = new Employee("Jenny", 38, 4, "jenny69@yahoo.co.uk", department);
		Employee employee4 = new Employee("Zoe", 51, 5, "zoe69@yahoo.co.uk", department);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);
	}

	@Test
	public void canCreateProject() {
		Department department = new Department("HR");
		departmentRepository.save(department);

		Employee employee5 = new Employee("Richard", 37, 69, "dicky69@yahoo.co.uk", department);
		Employee employee6 = new Employee("Effie", 30, 101, "effie101@yahoo.co.uk", department);
		employeeRepository.save(employee5);
		employeeRepository.save(employee6);

		Project project = new Project("Mass offloading", 5);
		projectRepository.save(project);

		project.addEmployee(employee5);
		project.addEmployee(employee6);
		projectRepository.save(project);
	}




}
