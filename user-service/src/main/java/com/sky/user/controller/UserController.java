package com.sky.user.controller;

import com.sky.user.entity.User;
import com.sky.user.service.UserService;
import com.sky.user.vo.Department;
import com.sky.user.vo.UserDepartmentVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users/")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping
	public User save(@RequestBody User user) {
		log.info("UserController.save");
		return userService.saveUser(user);
	}

	@GetMapping("{id}")
	public UserDepartmentVO getById(@PathVariable("id") Long id) {
		log.info("UserController.getById");
		User user = userService.getById(id);
		//http://localhost:9001/departments/
		Department department =
			restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
			Department.class);
		return  new UserDepartmentVO(user, department);
	}
}
