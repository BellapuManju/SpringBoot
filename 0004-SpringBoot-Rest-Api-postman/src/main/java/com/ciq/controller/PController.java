package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.model.Person;
import com.ciq.service.Pserviceimpl;
@RestController
public class PController {
	@Autowired
	private Pserviceimpl ps;
@GetMapping("/g")
	public String check() {
		return "hey";
	}
@GetMapping("/sa")
public ModelAndView save() {
	return new ModelAndView("insert");
}

@PostMapping("/insert")
public ModelAndView saved(Person person) {
	ps.save(person);
return new ModelAndView("redirect:all");
}

@GetMapping("/all")
public ModelAndView findall(Person person) {
	List<Person> ptu=ps.getAllPersons();
	return new ModelAndView("List","swa",ptu);
}
@GetMapping("/delete")
public ModelAndView delete(Person person) {
	ps.delete(person);
	return new ModelAndView("redirect:all");
}
	
@GetMapping("/up")
public ModelAndView getbyid(int id) {
	Person ta = ps.findbyid(id);
	return new ModelAndView("update","As",ta);	
	}

@PostMapping("/update")
public ModelAndView update(Person person) {
	ps.save(person);
	return new ModelAndView("redirect:all");	
}



}
