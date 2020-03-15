package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TestService {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="error")
	public String getTest() {
		return restTemplate.getForObject("http://springbootClienOne/test",String.class);
	}
	
	public String error() {
		return "服务都停止了 ";
	}
}
