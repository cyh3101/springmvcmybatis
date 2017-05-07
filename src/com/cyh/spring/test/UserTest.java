package com.cyh.spring.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cyh.spring.entity.User;
import com.cyh.spring.service.impl.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml","classpath:spring-service.xml"})
public class UserTest {
	@Autowired
	private UserService UserService;
	@Test
	public void test() {
		User user = this.UserService.getUserById(1);
		System.out.println(user.toString());
		//fail("Not yet implemented");
	}

}
