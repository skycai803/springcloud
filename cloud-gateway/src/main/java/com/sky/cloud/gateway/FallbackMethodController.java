package com.sky.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {
	@GetMapping("/userServiceFallback")
	public String userServiceFallback(){
		return "user service is not available, please try again later";
	}

	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallback(){
		return "department service is not available, please try again later";
	}
}
