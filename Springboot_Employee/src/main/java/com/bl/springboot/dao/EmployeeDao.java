package com.bl.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bl.springboot.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
