package com.sathish.angulartest.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.angulartest.entity.Student;
import com.sathish.angulartest.mapper.StudentMapper;
import com.sathish.angulartest.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentMapper sm;

	@Override
	public List<Student> findAllStudents() {
		return sm.findAllStudents();
	}

	@Override
	public Student findStudentsById(int id) {
		return sm.findStudentsById(id);
	}

	@Override
	public void insertStudent(Student student) {
		sm.insertStudent(student);
	}

	@Override
	public void updateStudent(Student students) {
		sm.updateStudent(students);
	}

	@Override
	public void deleteStudent(int id) {
		sm.deleteStudent(id);
	}

}
