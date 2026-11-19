package com.practicedemoproject.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.practicedemoproject.model.Employee;

@Component
public interface EmployeeService {
	
	void addEmployee(Employee emp);
	void deleteEmployee(int id);
	void updateEmployee(Employee emp);
	Employee getEmployee(int id);
	List<Employee>getAllEmployes();

}
