package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="springbootClienOne")
public interface IFeignClients {
	@RequestMapping(value="/heoll",method=RequestMethod.GET)
	 String hello(@RequestBody String str);

}
