package com.ciq.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.model.Student;
import com.ciq.service.AService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class Mediator {

	@Autowired
	private AService ss;
	

	@GetMapping("/findall")
	public List<Student> getall() {
		return ss.getAllPersons();
	}

	@PostMapping("/save2")
	public Student insert(@RequestBody Student s) {
		ss.save(s);
		System.out.println(s);
		return s;
	}

}
