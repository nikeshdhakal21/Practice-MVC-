package com.practicedemoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.practicedemoproject.model.Employee;
@Component
public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{
	
	

}
