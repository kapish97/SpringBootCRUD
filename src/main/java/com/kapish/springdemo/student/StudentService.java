package com.kapish.springdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public List<student> findAllStudents(){
		return List.of(
				new student("kapish","kanojia",LocalDate.now(),"test@gmail.com",23),
				new student("aditya1","singh",LocalDate.now(),"aditya@gmail.com",27)
				
				);
				
				
	}

}
