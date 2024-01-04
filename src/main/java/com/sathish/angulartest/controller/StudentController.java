package com.sathish.angulartest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sathish.angulartest.config.UserInfoUserDetailsService;
import com.sathish.angulartest.entity.AuthRequest;
import com.sathish.angulartest.entity.Student;
import com.sathish.angulartest.entity.UserInfo;
import com.sathish.angulartest.entity.UserResponse;
import com.sathish.angulartest.mapper.StudentMapper;
import com.sathish.angulartest.service.JwtService;
import com.sathish.angulartest.service.StudentService;

@CrossOrigin
@RestController
public class StudentController {

	private static final Logger logger = LogManager.getLogger(StudentController.class);

	@Autowired
	private StudentService ss;

	@Autowired
	private StudentMapper sm;

	@Autowired
	private JwtService jwtService;

	@Autowired
	private UserInfoUserDetailsService info;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@GetMapping("/findAllStudents")
	public List<Student> findAllStudents() {
		logger.error("Entering Find all controller class");
		return ss.findAllStudents();
	}

	@GetMapping("/findStudentsById/{id}")
	public Student findStudentsById(@PathVariable int id) {
		logger.error("Entering Find by id controller class");
		return ss.findStudentsById(id);
	}

	@PostMapping("/insertStudent")
	public String insertStudent(@RequestBody Student students) {
		logger.error("Entering Insert controller class");
		ss.insertStudent(students);
		return "Added Successfully";
	}

	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student students) {
		logger.error("Entering Update controller class");
		ss.updateStudent(students);
		return "Updated Successfully";
	}

	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		logger.error("Entering Delete controller class");
		ss.deleteStudent(id);
		return "ID " + id + " Deleted Successfully";
	}

	@PostMapping("/signin")
	public UserResponse signin(@RequestBody AuthRequest authRequest) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
		if (authentication.isAuthenticated()) {
			UserDetails userDetails = info.loadUserByUsername(authentication.getName());
			String token= jwtService.generateToken(userDetails);
			Map<String,Object> data=new HashMap<>();
			data.put("userDetails", userDetails);
			data.put("token", token);
			return new UserResponse(1,"Login Success",data,true);
		} else {
			return new UserResponse(2,"Login Failed",null,false);
		}
	}

	@PostMapping("/signup")
	public UserResponse signup(@RequestBody UserInfo user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		sm.saveUserLoginCred(user);
		return new UserResponse(1,"Signup Success",user,true);
	}

}
