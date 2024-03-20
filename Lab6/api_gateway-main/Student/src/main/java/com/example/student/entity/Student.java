package com.example.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ho_ten")
	private String name;

	private int age;

	@Column(name = "lop")
	private String classNumber;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

	
	public Student(Long id, String name, int age, String classNumber) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.classNumber = classNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", classNumber=" + classNumber + "]";
	}

	public Student() {
		super();
	}

}
