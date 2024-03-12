package com.iuh.jwt_redis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iuh.jwt_redis.entity.User;
import com.iuh.jwt_redis.repository.UserDao;
import com.iuh.jwt_redis.service.JwtService;



@SpringBootApplication
@RestController
@RequestMapping("/user")
@EnableCaching
@ComponentScan(basePackages = {"com.iuh.jwt_redis"})

public class UserController {
	@Autowired
	private UserDao dao;
	
	@Autowired
    private JwtService jwtService;
	
	@PostMapping("/login")
    public String login(@RequestBody User user) {
        // Validate user credentials
        User foundUser = dao.findUserByEmail(user.getEmail());
        if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
            // If credentials are valid, generate and return JWT
            return jwtService.generateToken(user.getEmail());
        } else {
            // If credentials are not valid, return error message
            return "Invalid email or password";
        }
    }
	
	@PostMapping
	public User save(@RequestBody User user) {
		return dao.save(user);
	}
	
	@GetMapping 
	public List<User> getAllUser() {
		return dao.findAll();
	}
	
	@GetMapping("/{id}")
	@Cacheable(key = "#id", value= "User", unless = "#result.price > 1000")
	public User findProduct(@PathVariable int id) {
		return dao.findUserById(id);
	}
	
	@DeleteMapping("/{id}")
	@Cacheable(key = "#id", value= "User")
	public String remove(@PathVariable int id) {
		return dao.deleteUser(id);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(UserController.class, args);
	}

}
