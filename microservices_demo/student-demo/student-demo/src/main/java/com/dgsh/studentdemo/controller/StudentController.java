package com.dgsh.studentdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgsh.studentdemo.bean.Student;
import com.dgsh.studentdemo.config.StudentConfig;

@RestController
public class StudentController {
	
	@Autowired
	private StudentConfig studentConfig;
	
	@GetMapping("/student")
	public Student getAllStudent() {
		return new Student(studentConfig.getFirstName(),studentConfig.getLastName());
	}
	
}
