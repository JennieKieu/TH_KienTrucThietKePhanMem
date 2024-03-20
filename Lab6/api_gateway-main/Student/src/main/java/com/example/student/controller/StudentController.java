package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;
//import com.example.student.feign.PublisherFeignClient;
import com.example.student.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentService;

//	@Autowired
//	private PublisherFeignClient publisherFeignClient;

	@GetMapping
	public List<Student> getAllBooks() {
		return studentService.getAllBooks();
	}

	@PostMapping
	public void addBook(@RequestBody Student student) {
		studentService.addBook(student);
	}

////	@GetMapping("/monHoc")
////	public List<Mo> getAllPublishers() {
////		return publisherFeignClient.getAllPublishers();
////	}
//}
}
