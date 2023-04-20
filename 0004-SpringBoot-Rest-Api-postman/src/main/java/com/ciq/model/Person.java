package com.ciq.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Person {
@Id
private Integer id;
private String name;
private double fee;
private String gmail;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(Integer id, String name, double fee, String gmail) {
	super();
	this.id = id;
	this.name = name;
	this.fee = fee;
	this.gmail = gmail;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
public String getGmail() {
	return gmail;
}
public void setGmail(String gmail) {
	this.gmail = gmail;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", fee=" + fee + ", gmail=" + gmail + "]";
}

}
