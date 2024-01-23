package com.fit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fit.demo.entity.User;
import com.fit.demo.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public User addUser(User user) {
		return userRepository.save(user);		
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
		userRepository.deleteById(id);
		
	}

	
	
	

}