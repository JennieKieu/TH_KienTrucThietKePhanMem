package com.example.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apigateway.entity.MonHoc;
import com.example.apigateway.entity.Student;
import com.example.apigateway.service.ApiGateService;

@RestController
@RequestMapping("/api")
public class ApiGateController {
	private final ApiGateService apiGateService;

	public ApiGateController(ApiGateService apiGateService) {
		this.apiGateService = apiGateService;
	}

	// Endpoint để thêm một môn học mới
	@PostMapping("/monhoc")
	public MonHoc addMonHoc(@RequestBody MonHoc monHoc) {
		return apiGateService.addMonHoc(monHoc);
	}

	// Endpoint để thêm một sinh viên mới
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return apiGateService.addStudent(student);
	}
    @GetMapping("/monhoc/{id}")
    public MonHoc getMonHocById(@PathVariable Long id) {
        return apiGateService.getMonHocById(id);
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return apiGateService.getStudentById(id);
    }
}
