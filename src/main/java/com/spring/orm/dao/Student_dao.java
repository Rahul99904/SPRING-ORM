package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;



public class Student_dao {
private HibernateTemplate hibernateTemplate;

public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}

@Transactional
public int insert (Student student) {
	Integer i=(Integer)this.hibernateTemplate.save(student);
return i;	
}

public Student getstudent(int id) {
	Student studd=this.hibernateTemplate.get(Student.class,id);
	return studd;
}

public List<Student> getall(){
	List<Student> stud_all=this.hibernateTemplate.loadAll(Student.class);
	return stud_all;
}

@Transactional
public void delete(int id) {
	Student studd=this.hibernateTemplate.get(Student.class,id);
	this.hibernateTemplate.delete(studd);
	System.out.println("Deleted");
}

@Transactional
public void update(Student stud) {
	this.hibernateTemplate.update(stud);
	System.out.println("Updated");
}


}
