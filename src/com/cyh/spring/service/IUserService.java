package com.cyh.spring.service;

import com.cyh.spring.entity.User;

public interface IUserService {
	public User getUserById(int id);
	public void addUser(User user);
}
