package com.sky.department.service;

import com.sky.department.entity.Department;
import com.sky.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("DepartmentService.saveDepartment");
		return departmentRepository.save(department);
	}

	public Department getById(Long id) {
		log.info("DepartmentService.getById");
		return departmentRepository.findDepartmentById(id);
	}
}
