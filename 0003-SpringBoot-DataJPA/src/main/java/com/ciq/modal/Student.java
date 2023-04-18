package com.ciq.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;

@Entity
@Table(name="student")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column
private String name;
@Column
private String location;

public Student() {
	super();
}

public Student(int id, String name, String location) {
	super();
	this.id = id;
	this.name = name;
	this.location = location;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", location=" + location + "]";
}


	
	
	
}
