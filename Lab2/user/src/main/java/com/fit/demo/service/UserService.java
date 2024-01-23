package com.fit.demo.service;

import java.util.List;

import com.fit.demo.entity.User;

public interface UserService {
	
	public List<User> getAllUser();
	public User getUserById(Long id);
	public User addUser(User user);
	public void deleteUser(Long id);

}