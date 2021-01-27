package com.java.customer.dao;

import java.util.List;

import com.java.customer.entity.Student;

public interface StudentDao {

	public   List<Student> customerList();
	public void saveStudent(Student student);
}
