package com.java.customer.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.customer.entity.Student;
@Repository
public class StudentDaoImp implements StudentDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Student> customerList() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		org.hibernate.Query<Student> query=session.createQuery("from Student",Student.class);
		List<Student> students=query.getResultList();
		return students;
	}

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(student);
	}

}
