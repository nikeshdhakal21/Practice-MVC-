package com.practicedemoproject.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicedemoproject.model.Department;
import com.practicedemoproject.repository.DepartmentRepository;

import com.practicedemoproject.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository deptRepo;
	
	@Override
	public void addDepartment(Department dept) {
		
		deptRepo.save(dept);
		
		
	}

	@Override
	public void deleteDepartment(int id) {
		
		deptRepo.deleteById(id);
		
	}

	@Override
	public void updateDepartment(Department dept) {
		
		deptRepo.save(dept);
		
	}

	@Override
	public Department getDepartment(int id) {
		
		return deptRepo.findById(id).get();
	}

	@Override
	public List<Department> getDeptList() {
		
		return deptRepo.findAll();
	}

}
