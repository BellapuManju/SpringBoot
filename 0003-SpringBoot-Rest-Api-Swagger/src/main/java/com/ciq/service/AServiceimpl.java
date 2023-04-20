package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.Dao;
import com.ciq.model.Student;
@Service
public class AServiceimpl  implements AService{
  @Autowired
  private Dao da;
	@Override
	public Student save(Student student) {
		return da.save(student);
	}
	@Override
	public List<Student> getAllPersons() {
		return da.findAll();
	}
	@Override
	public void delete(Student student) {
    da.delete(student);		
	
	
	}
	@Override
	public Student findbyid(int id) {
		return da.findById(id).get();
	}

   @Override
   public void update(Student student) {
	da.save(student);
}

}
