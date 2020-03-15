package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableEurekaClient
@SpringBootApplication
@EnableHystrix
@EnableFeignClients
public class SpingBootLoadBalancerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingBootLoadBalancerApplication.class, args);
	}

}
