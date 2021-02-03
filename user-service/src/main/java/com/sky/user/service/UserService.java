package com.sky.user.service;

import com.sky.user.entity.User;
import com.sky.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User saveUser(User department) {
		log.info("UserService.saveDepartment");
		return userRepository.save(department);
	}

	public User getById(Long id) {
		log.info("UserService.getById");
		return userRepository.findUserById(id);
	}
}
