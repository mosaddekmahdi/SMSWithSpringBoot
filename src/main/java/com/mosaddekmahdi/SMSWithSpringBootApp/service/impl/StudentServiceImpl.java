package com.mosaddekmahdi.SMSWithSpringBootApp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mosaddekmahdi.SMSWithSpringBootApp.entity.Student;
import com.mosaddekmahdi.SMSWithSpringBootApp.repository.StudentRepository;
import com.mosaddekmahdi.SMSWithSpringBootApp.service.StudentService;


@Service 
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
