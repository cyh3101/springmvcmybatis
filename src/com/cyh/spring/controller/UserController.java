package com.cyh.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cyh.spring.service.IUserService;

public class UserController implements Controller{
	private IUserService userService;
	public String login(){
		this.userService.getUserById(2);
		return "success";
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
