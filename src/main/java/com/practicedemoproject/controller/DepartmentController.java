package com.practicedemoproject.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.practicedemoproject.model.Department;
import com.practicedemoproject.service.DepartmentService;

@Controller
public class DepartmentController {
	
	
	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/department")
	public String getDepartment(Model model) {
		model.addAttribute("department", new Department());
		return "deptForm";
		
	}
	@PostMapping("/addDepartment")
	public String postDepartment(@ModelAttribute Department dept) {
		deptService.addDepartment(dept);
		return "redirect:/department";
		
	}
	
	@GetMapping("/deptList")
	public String getDeptList(Model model) {
		
		model.addAttribute("department",deptService.getDeptList());
		return "deptList";
	}
	
	@GetMapping("/dept/edit/{id}")
	public String getEdit(@PathVariable int id,  Model model) {
		model.addAttribute("department", deptService.getDepartment(id));
		
		return "EditForm";
	}
	
	@GetMapping("/dept/delete/{id}")
	public String getDelete(@PathVariable int id) {
		deptService.deleteDepartment(id);
		return "redirect:/deptList";
	}
	 
	@PostMapping("/dept/update")
	public String postUpdate(@ModelAttribute Department dept) {
		deptService.updateDepartment(dept);
		return "redirect:/deptList";
	}
	

}
