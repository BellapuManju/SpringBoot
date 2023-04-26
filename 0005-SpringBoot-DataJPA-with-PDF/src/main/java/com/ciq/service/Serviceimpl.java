package com.ciq.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.StudentRepository;
import com.ciq.modal.Student;
@Service
public class Serviceimpl<repository> implements Sservice {
	@Autowired
	private StudentRepository rept;

	@Override
	public Student save(Student student) {
		return rept.save(student);
		}

	@Override
	public List<Student> students() {
		return rept.findAll();
	
		
	}
	
	
  public Student findbyid(int id) {
	  return rept.findById(id).get();
  }

@Override
public void update(Student student) {
	rept.save(student);
}

public void delete(int id) {
	 Student s=new Student();
	 s.setId(id);
	rept.delete(s);
	
}

@Override
public Student getbyid(int id) {
	Optional<Student> empOptional = rept.findById(id);
	if(empOptional.isPresent()) {
		return empOptional.get();
	}
	
	return null;
}




}
