package com.fit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fit.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
