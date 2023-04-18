package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.modal.Student;
import com.ciq.service.Serviceimpl;

@RestController
public class Controller {
	@Autowired
	    private Serviceimpl serv;
	
//	@GetMapping("/hel")
//	public String name() {
//		return "Home";
//	}
	
	@GetMapping("/sa")
	public ModelAndView save() {
		return new ModelAndView("insert");
	}
	
	@PostMapping("/insert")
	public ModelAndView saved(Student student) {
		serv.save(student);
	return new ModelAndView("redirect:all");
	}
	
	@GetMapping("/all")
	public ModelAndView findall(Student student) {
		List<Student> stu=serv.students();
		return new ModelAndView("findall","swa",stu);
	}
	
	
	
	@GetMapping("/up")
	public ModelAndView getbyid(int id) {
		Student ta = serv.findbyid(id);
		return new ModelAndView("update","As",ta);	
		}
	
	@PostMapping("/update")
	public ModelAndView update(Student student) {
		serv.save(student);
		return new ModelAndView("redirect:all");	
	}
	
	@GetMapping("/delete")
	public ModelAndView delete(int id) {
			serv.delete(id);
	return new ModelAndView("redirect:all");
		}
	
}
