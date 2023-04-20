package com.ciq.service;

import java.util.List;

import com.ciq.model.Person;

public interface PService {
	void save(Person person);
	void delete(Person person);
	Person findbyid(Integer id);
	List<Person> getAllPersons();
		void update(Person person);
}
