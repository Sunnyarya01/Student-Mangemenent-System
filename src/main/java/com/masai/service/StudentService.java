package com.masai.service;

import java.util.List;

import com.masai.enitiy.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Integer id);
	
	Student updateStudent(Student student);
	
	Student deleteStudent(Integer id);
	
}
