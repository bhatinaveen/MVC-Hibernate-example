package com.java.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.customer.dao.StudentDao;
import com.java.customer.entity.Student;
@Service
public class CustomerServiceImp implements CustomerService {
@Autowired
private StudentDao studentDao;
	@Override
	@Transactional
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return studentDao.customerList();
	}
	@Override
	@Transactional
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		 studentDao.saveStudent(student);
	}

}
