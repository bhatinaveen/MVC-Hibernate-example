package com.java.customer.service;

import java.util.List;

import com.java.customer.entity.Student;

public interface CustomerService {

	public List<Student> getStudentList();
	public void saveStudent(Student student);
}
