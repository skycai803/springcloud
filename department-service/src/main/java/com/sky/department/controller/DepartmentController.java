package com.sky.department.controller;

import com.sky.department.entity.Department;
import com.sky.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments/")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping
	public Department save(@RequestBody Department department) {
		log.info("DepartmentController.save");
		return departmentService.saveDepartment(department);
	}

	@GetMapping("{id}")
	public Department getById(@PathVariable("id") Long id) {
		log.info("DepartmentController.getById");
		return departmentService.getById(id);
	}
}
