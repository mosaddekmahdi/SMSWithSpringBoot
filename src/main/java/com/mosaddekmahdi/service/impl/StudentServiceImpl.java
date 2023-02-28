package com.mosaddekmahdi.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mosaddekmahdi.entity.Student;
import com.mosaddekmahdi.repository.StudentRepository;
import com.mosaddekmahdi.service.StudentService;


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
