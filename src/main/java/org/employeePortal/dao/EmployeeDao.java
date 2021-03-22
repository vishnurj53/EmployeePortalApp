package main.java.org.employeePortal.dao;

import java.util.List;

import main.java.org.employeePortal.model.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployees() ;

	public Employee getEmployee(int id) ;

	public Employee addEmployee(Employee employee);

	public void updateEmployee(Employee employee) ;

	public void deleteEmployee(int id) ;
}
