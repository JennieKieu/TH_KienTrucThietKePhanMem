package com.example.student.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.student.entity.Student;


public interface StudentRepository extends CrudRepository<Student, Long> {
	List<Student> findAll();

	Optional<Student> findById(Long id);

}
