package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_entry")
public class Student {

	@Id
	@Column(name="id")
	private int stud_id;
	@Column(name="name")
	private String stud_name;
	@Column(name="city")
	private String stud_city;
	
	public int getStud_id() {
		return stud_id;
	}

	
	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_city=" + stud_city + "]";
	}


	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getStud_city() {
		return stud_city;
	}

	public void setStud_city(String stud_city) {
		this.stud_city = stud_city;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stud_id, String stud_name, String stud_city) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_city = stud_city;
	}
}
