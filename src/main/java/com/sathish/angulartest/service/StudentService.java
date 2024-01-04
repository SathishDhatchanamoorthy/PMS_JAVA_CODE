package com.sathish.angulartest.service;

import java.util.List;

import com.sathish.angulartest.entity.Student;


public interface StudentService {
	
	List<Student> findAllStudents();
	
	Student findStudentsById(int id);
	
	void insertStudent(Student student);
	
	void updateStudent(Student students);
	
	void deleteStudent(int id);

}
