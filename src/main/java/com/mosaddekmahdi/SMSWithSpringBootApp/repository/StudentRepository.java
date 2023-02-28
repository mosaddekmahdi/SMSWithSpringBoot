package com.mosaddekmahdi.SMSWithSpringBootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mosaddekmahdi.SMSWithSpringBootApp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	 
	

}
