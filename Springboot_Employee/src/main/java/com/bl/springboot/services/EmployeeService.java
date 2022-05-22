package com.bl.springboot.services;

import java.util.List;

import com.bl.springboot.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployee(); 
	public Employee getEmployee(long employeeId);
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee deleteEmployee(long employeeId);
		
	
}
