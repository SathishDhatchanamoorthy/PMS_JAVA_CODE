package com.example.server.pms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.server.employee_master_service.Employeemasterservice;
import com.example.server.pms.entity.Employeemaster;
import com.example.server.pms.entity.PmsResponseMessage;
import jakarta.persistence.EntityExistsException;

@RestController
@CrossOrigin(value = "http://localhost:4200/")
public class Empmastercontroller {

	@Autowired
	private Employeemasterservice service;

	@GetMapping("/getalllist")
	public PmsResponseMessage getAll() {
		return service.getAll();
	}

	@PostMapping("/savedata")
	public PmsResponseMessage create(@RequestBody Employeemaster employeemaster) {
		return service.create(employeemaster);
	}

	@GetMapping("/allmanagers")
	public PmsResponseMessage getAllManagers() {
		return service.getAllManagers();
	}

	@GetMapping("/alldepartments")
	public PmsResponseMessage getAllDepartments() {
		return service.getAllDepartments();
	}

	@GetMapping("/allteams")
	public PmsResponseMessage getAllTeams() {
		return service.getAllTeams();
	}
	
	@GetMapping("/allLocations")
	public PmsResponseMessage getAllLocations() {
		return service.getAllLocations();
	}
	
	@GetMapping("/getAllDesignation")
	public PmsResponseMessage getAllDesignations() {
		return service.getAllDesignations();
	}
	

	@GetMapping("findById/{emp_id}")
	public ResponseEntity<Employeemaster> getById(@PathVariable Integer emp_id) {
		Optional<Employeemaster> retrivebyid = service.getById(emp_id);
		return retrivebyid.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));

	}

	// @Autowired
	// private ExcelHelper excelhelper;

//update Operation 
//@PutMapping("/update/findId/{emp_id}")
//public ResponseEntity<ResponseMessage> update(@PathVariable int emp_id, @RequestBody Employeemaster employeemaster) {
//    employeemaster.setEmp_id(emp_id);
//    Employeemaster updatedata = service.update(employeemaster);
//
//    if (updatedata != null) {
//    	ResponseMessage response = new ResponseMessage("Data updated successfully");
//        return ResponseEntity.status(HttpStatus.OK).body(response);
//    } else {
//    	ResponseMessage response = new ResponseMessage(null);
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
//    }
//}

	// Delete operation by praveen k
//@DeleteMapping("delete/{emp_id}")
//public ResponseEntity<String> delete(@PathVariable Integer emp_id) {
//    service.delete(emp_id);
//    return new ResponseEntity<>("Data Delete Successfully", HttpStatus.NO_CONTENT);
//}

	/*
	 * @PostMapping("/upload") public ResponseEntity<ResponseMessage>
	 * uploadFile(@RequestParam("file") MultipartFile file) { String message = "";
	 * 
	 * if (file.isEmpty()) { message = "Please select a file to upload"; return
	 * ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage()); }
	 * 
	 * try { if (service.dateValidation()) { message =
	 * "Data already exists in the employee table. Upload is not allowed."; return
	 * ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage()); }
	 * 
	 * // Continue with the file upload logic here // ...
	 * 
	 * // If the file upload is successful, you can return a success message message
	 * = "File uploaded successfully"; return
	 * ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage()); } catch
	 * (Exception e) { e.printStackTrace(); message =
	 * "An error occurred during file upload: " + e.getMessage(); return
	 * ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new
	 * ResponseMessage()); } }
	 */

	/*
	 * @PostMapping("/upload") public ResponseEntity<ResponseMessage>
	 * uploadFile(@RequestParam("file") MultipartFile file) { String message = "";
	 * 
	 * if (file.isEmpty()) { message = "Please select a file to upload"; return
	 * ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage()); }
	 * 
	 * try {
	 * 
	 * Employee_master employee = new Employee_master(); if
	 * (service.insertEmployeeData(employee)) { message =
	 * "Data already exists in the employee table. Upload is not allowed."; return
	 * ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage()); }
	 * 
	 * // Continue with the file upload logic here // ...
	 * 
	 * // If the file upload is successful, you can return a success message message
	 * = "File uploaded successfully"; return
	 * ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage()); } catch
	 * (Exception e) { e.printStackTrace(); message =
	 * "An error occurred during file upload: " + e.getMessage(); return
	 * ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new
	 * ResponseMessage()); } }
	 */

//@PostMapping("/upload")
//public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
//    String message = "starting";
//
//    if (file.isEmpty()) {
//        message = "Please select a file to upload";
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
//    }
//
//    try {
//        List<Employeemaster> employees = service.processExcelFile(file);
//
//        if (employees.isEmpty()) {
//            message = "No data found in the Excel file";
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
//        }
//
//        for (Employeemaster employee : employees) {
//            if (!service.insertEmployeeData(employee)) {
//                message = "Error inserting employee data into the database";
//                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ResponseMessage(message));
//            }
//        }
//
//        message = "File uploaded and data inserted successfully";
//        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
//    } catch (Exception e) {
//        e.printStackTrace();
//        message = "An error occurred during file upload: " + e.getMessage();
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ResponseMessage(message));
//    }
//}

	// @PostMapping("/savedata")
	// public ResponseEntity<Map<String, Object>> create(@RequestBody Employeemaster
	// employeemaster) {
//	    Employeemaster createData = service.create(employeemaster);
//	    Map<String, Object> responseMap = new HashMap<>();
//	    responseMap.put("data", createData);
//	    responseMap.put("message", "Data saved successfully");
//	    return ResponseEntity.status(HttpStatus.CREATED).body(responseMap);
	// }

	// Findby Id Data

}
