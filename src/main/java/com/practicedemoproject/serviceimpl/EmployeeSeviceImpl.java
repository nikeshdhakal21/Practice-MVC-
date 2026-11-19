package com.practicedemoproject.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicedemoproject.model.Employee;
import com.practicedemoproject.repository.EmployeeRepository;
import com.practicedemoproject.service.EmployeeService;

@Service
public class EmployeeSeviceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public void addEmployee(Employee emp) {
		
		empRepo.save(emp);
		
		
	}

	@Override
	public void deleteEmployee(int id) {
		empRepo.deleteById(id);
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		empRepo.save(emp);
		
		
	}

	@Override
	public Employee getEmployee(int id) {
		
		return empRepo.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployes() {
		
		return empRepo.findAll();
	}
	
	
	

}
