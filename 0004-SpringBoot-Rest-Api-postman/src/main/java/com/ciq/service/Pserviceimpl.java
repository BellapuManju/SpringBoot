package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.Dao;
import com.ciq.model.Person;

@Service
public class Pserviceimpl implements PService {
	@Autowired
	private Dao da;

	@Override
	public void save(Person person) {
		da.save(person);
	}

	@Override
	public Person findbyid(Integer id) {

		return da.getById(id);
	}

	@Override
	public List<Person> getAllPersons() {

		return da.findAll();
	}

	@Override
	public void update(Person person) {
		da.save(person);
	}

	@Override
	public void delete(Person person) {
		da.delete(person);
	}

}
