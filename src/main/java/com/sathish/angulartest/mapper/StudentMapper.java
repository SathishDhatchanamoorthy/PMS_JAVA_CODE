package com.sathish.angulartest.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.sathish.angulartest.entity.Student;
import com.sathish.angulartest.entity.UserInfo;


@Mapper
public interface StudentMapper {
	
	List<Student> findAllStudents();
	
	Student findStudentsById(int id);

	void insertStudent(Student student);

	void updateStudent(Student student);

	void deleteStudent(Integer id);
	
	Optional<UserInfo> findByUsername(String username);
	
	void saveUserLoginCred(UserInfo user);

}
