package com.ciq.service;

import java.util.List;

import com.ciq.modal.Student;

public interface Sservice {
public Student save(Student student);
List<Student>students();
void delete(int id);
Student getbyid(int id);

Student findbyid(int id);
void update(Student student);

}
