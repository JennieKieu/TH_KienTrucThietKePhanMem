package com.example.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
//	@Autowired
//	private PublisherFeignClient publisherFeignClient;

//	@Autowired
//    private RestTemplate restTemplate;
	public List<Student> getAllBooks() {
		return (List<Student>) studentRepository.findAll();
	}

	public void addBook(Student student) {
		studentRepository.save(student);
	}

//	public List<Publisher> getAllPublishers() {
//		return publisherFeignClient.getAllPublishers();
//	}

}
