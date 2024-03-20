package com.example.apigateway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.apigateway.entity.MonHoc;
import com.example.apigateway.entity.Student;

@Service
public class ApiGateService {
	  @Autowired
	    private RestTemplate restTemplate;

	    public MonHoc getMonHocById(Long id) {
	        String monHocUrl = "http://localhost:8082/api/monhoc/" + id;
	        ResponseEntity<MonHoc> response = restTemplate.getForEntity(monHocUrl, MonHoc.class);
	        return response.getBody();
	    }

	    public Student getStudentById(Long id) {
	        String studentUrl = "http://localhost:8085/api/student/" + id;
	        ResponseEntity<Student> response = restTemplate.getForEntity(studentUrl, Student.class);
	        return response.getBody();
	    }
	    public MonHoc addMonHoc(MonHoc monHoc) {
	        String monHocUrl = "http://localhost:8082/api/monhoc";
	        ResponseEntity<MonHoc> response = restTemplate.postForEntity(monHocUrl, monHoc, MonHoc.class);
	        return response.getBody();
	    }

	    public Student addStudent(Student student) {
	        String studentUrl = "http://localhost:8085/api/student";
	        ResponseEntity<Student> response = restTemplate.postForEntity(studentUrl, student, Student.class);
	        return response.getBody();
	    }
}
