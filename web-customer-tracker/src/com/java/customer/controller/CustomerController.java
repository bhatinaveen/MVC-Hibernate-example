package com.java.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.customer.entity.Student;
import com.java.customer.service.CustomerService;

@Controller
@RequestMapping("/student")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/list")
	public String viewHome(Model model) {
		List<Student> list = customerService.getStudentList();

		model.addAttribute("list", list);
		return "home";
	}

	@RequestMapping(value = "/saveCustomerDetail")
	public String customerDetailSavePage(Model model) {
		
		Student student=new Student();
		model.addAttribute("student", student);
		return "saveCustomerPage";
	}
	@PostMapping(value = "/saveStudent")
	public String saveCustomerDetails(@ModelAttribute("student") Student student) {
		
//		Student student=new Student();
		customerService.saveStudent(student);
		return "redirect:/student/list";
	}
	
	
}
