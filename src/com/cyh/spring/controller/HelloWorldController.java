package com.cyh.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping("/helloworld")
	public String hello(){
		return "success";
	}
}
