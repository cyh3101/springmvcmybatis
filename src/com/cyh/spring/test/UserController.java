package com.cyh.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyh.spring.dao.UserDao;
import com.cyh.spring.entity.User;
import com.cyh.spring.service.impl.UserService;

public class UserController {

	public static void main(String[] args) {
		ApplicationContext ac = null;
		ac = new ClassPathXmlApplicationContext("spring-dao.xml","spring-service.xml");
//		UserDao userDao = (UserDao)ac.getBean("userDao");
//		User user = new User();
//		user = userDao.getUserById(1);
//		System.out.println(user.toString());
//		
//		user = new User(2, "cyh2", "aaaa");
//		userDao.addUser(user);
		
		UserService userService = (UserService)ac.getBean("userService");
		User user = new User();
		user = userService.getUserById(1);
		System.out.println(user.toString());
		
		
		
		
	}

}
