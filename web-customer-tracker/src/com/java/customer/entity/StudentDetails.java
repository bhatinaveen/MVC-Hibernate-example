package com.java.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class StudentDetails {
	@Id
	@Column(name = "idstudent_details")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idStudentDetails;
	@Column(name = "subject")
	private String subject;
	@Column(name = "mobileNumber")
	private String mobileNUmber;
	

	public int getIdStudentDetails() {
		return idStudentDetails;
	}

	public void setIdStudentDetails(int idStudentDetails) {
		this.idStudentDetails = idStudentDetails;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMobileNUmber() {
		return mobileNUmber;
	}

	public void setMobileNUmber(String mobileNUmber) {
		this.mobileNUmber = mobileNUmber;
	}

	@Override
	public String toString() {
		return "StudentDetails [idStudentDetails=" + idStudentDetails + ", subject=" + subject + ", mobileNUmber="
				+ mobileNUmber + "]";
	}

	public StudentDetails(String subject, String mobileNUmber) {
		super();
		this.subject = subject;
		this.mobileNUmber = mobileNUmber;
	}

	public StudentDetails() {
		super();
	}

}
