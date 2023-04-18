package com.ciq.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.modal.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>{


}
