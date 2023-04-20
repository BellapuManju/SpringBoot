package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.model.Student;
import com.ciq.service.AService;

@Controller
public class AstController {
	@Autowired
	private AService serv;
	@GetMapping("/hh")
	public String name() {
		return "hey";
	}
   @GetMapping("/ma")
     public ModelAndView save() {
	   return new ModelAndView("insert");
	
}
   @PostMapping("/insert")
   public ModelAndView insertvalues(Student student) {
	   serv.save(student);
	   
	return new ModelAndView("redirect:all");
	   
	   
   }
   @GetMapping("/all")
   public ModelAndView list(Student student) {
	   List<Student> stu=serv.getAllPersons();
	return new ModelAndView("all","sa",stu);
	   
   }
   @GetMapping("/delete")
   public ModelAndView delete(Student student) {
	    serv.delete(student);
	    return new ModelAndView("redirect:all");  
	    }
   @GetMapping("/up")
   public ModelAndView getbyid(int id) {
	   Student st=serv.findbyid(id);
	   return new ModelAndView("update","as",st);
   }

    @PostMapping("/update")
public ModelAndView update(Student student) {
	serv.save(student);
	return new ModelAndView("redirect:all");
}
	
	
}
