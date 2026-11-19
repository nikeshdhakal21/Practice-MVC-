package com.practicedemoproject.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.practicedemoproject.model.Department;

@Component
public interface DepartmentService {

	
	void addDepartment(Department dept);
	void deleteDepartment(int id);
	void updateDepartment(Department dept);
	Department getDepartment(int id);
	List<Department> getDeptList();
	
}
