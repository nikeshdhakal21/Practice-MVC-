package com.practicedemoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.practicedemoproject.model.Department;

@Component
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
