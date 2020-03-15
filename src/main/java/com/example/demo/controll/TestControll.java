package com.example.demo.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;

@RestController
public class TestControll {
	@Autowired
	TestService testService;
	
	@GetMapping("/test")
	public String test() {
		return testService.getTest();
	}

}
