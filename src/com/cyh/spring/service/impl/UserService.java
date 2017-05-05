package com.cyh.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cyh.spring.dao.UserDao;
import com.cyh.spring.entity.User;
import com.cyh.spring.service.IUserService;

public class UserService implements IUserService{

	@Autowired
	private UserDao userDao;
	@Override
	public User getUserById(int id) {
		return this.userDao.getUserById(id);
	}

	@Override
	public void addUser(User user) {
		this.userDao.addUser(user);
	}

}
