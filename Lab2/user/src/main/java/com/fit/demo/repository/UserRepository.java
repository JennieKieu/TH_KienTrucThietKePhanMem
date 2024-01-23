package com.fit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fit.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}