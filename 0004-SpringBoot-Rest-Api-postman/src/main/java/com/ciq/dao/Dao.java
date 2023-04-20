package com.ciq.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.model.Person;

public interface Dao extends JpaRepository<Person, Integer> {
	

}
