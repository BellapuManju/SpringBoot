package com.ciq.service;

import java.util.List;

import com.ciq.model.Student;

public interface AService {
Student save(Student student);
List<Student> getAllPersons();
void delete(Student student);
Student findbyid(int id);
void update(Student student);
}
