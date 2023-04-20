package com.ciq.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ciq.model.Student;

public interface Dao extends JpaRepository<Student, Integer>{
	

}
