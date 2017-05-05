package com.cyh.spring.dao;

import com.cyh.spring.entity.User;

public interface UserDao {
	public User getUserById(int id);
	public void addUser(User user);
}
