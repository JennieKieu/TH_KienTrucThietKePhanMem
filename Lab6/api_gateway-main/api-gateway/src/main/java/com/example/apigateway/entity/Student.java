package com.example.apigateway.entity;


public class Student {

	private Long id;
	private String name;
	private int age;
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
