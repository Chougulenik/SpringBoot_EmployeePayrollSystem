package com.bl.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.springboot.dao.EmployeeDao;
import com.bl.springboot.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
		
	public EmployeeServiceImpl() {
		
	}

	@Override
	public List<Employee> getEmployee() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(long employeeId) {
	return employeeDao.findById(employeeId).get();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee deleteEmployee(long employeeId) {
		Employee entity = employeeDao.getById(employeeId);
		employeeDao.delete(entity);
		return entity;
	}

}
