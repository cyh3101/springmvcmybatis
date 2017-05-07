package com.cyh.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cyh.spring.entity.User;
import com.cyh.spring.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController{
	@Autowired
	private IUserService userService;
	@RequestMapping("/login")
	public String login(){
		User user = this.userService.getUserById(3);
		if(user != null){
			return "success";
		}
		return "error";
	}
}
