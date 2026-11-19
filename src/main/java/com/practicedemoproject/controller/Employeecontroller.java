package com.practicedemoproject.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.practicedemoproject.model.Employee;
import com.practicedemoproject.service.DepartmentService;
import com.practicedemoproject.service.EmployeeService;



@Controller
public class Employeecontroller {
	@Autowired
	private EmployeeService empService;
	@Autowired
	private DepartmentService deptService;
	
	
	@GetMapping("/employee")
	public String getEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		model.addAttribute("dList",deptService.getDeptList());
		return "empForm";
	}
	@PostMapping("/employee")
	public String postEmployee(@ModelAttribute Employee emp) {
		empService.addEmployee(emp);
		return "empForm";
	}
//	@GetMapping("/employee")
//	public String gettEmployee(Model model) {
//		
//		return "empForm";
//	}
	
	
    
	
	@GetMapping("/empList")
	public String getAllEmployee(Model model) {
		model.addAttribute("employees",empService.getAllEmployes());
		
		return "empList";
		
	}
	
	
	
	
	@GetMapping("/emp/delete/{id}")
	public String deleteEmployee(@PathVariable  int id) {
		empService.deleteEmployee(id);
		return "redirect:/empList";
	}
	
	@GetMapping("/emp/edit/{id}")
	public String editEmployee(@PathVariable int id,Model model) {
	
	model.addAttribute("employee",empService.getEmployee(id));
	
	return "EditForm";
	
	}
	
	@PostMapping("/emp/update")
	public String updateEmployee(@ModelAttribute Employee emp) {
		empService.addEmployee(emp); 
		return "redirect:/empList";
	}
	
	
	
	
	
	

}
