package com.sathish.angulartest.praveen;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Empmastercontroller {

	
@Autowired
private Employeemasterservice service;



//@Autowired
//private ExcelHelper excelhelper;

//creation
@PostMapping("/savedata")
public ResponseEntity<Employeemaster>create(@RequestBody Employeemaster employee_master){
	Employeemaster CreateData=service.create(employee_master);
	return new ResponseEntity<>(CreateData,HttpStatus.CREATED);
	
}


//Read Operation
@GetMapping("/getalllist")
public ResponseEntity<List<Employeemaster>> getAll(){
	List<Employeemaster> listdata=service.getAll();
	return new ResponseEntity<>(listdata,HttpStatus.CREATED);
}

//Findby Id Data

@GetMapping("/{emp_id}")
public ResponseEntity<Employeemaster>getById(@PathVariable Integer emp_id ){
	Optional<Employeemaster> retrivebyid=service.getById(emp_id);
	return retrivebyid.map(value -> new ResponseEntity<>(value,HttpStatus.OK))
			.orElseGet(() ->new ResponseEntity<>(HttpStatus.NOT_FOUND));
		
}


//update Operation 

@PutMapping("/update/{emp_id}")
public ResponseEntity<Employeemaster>update(@PathVariable int emp_id ,@RequestBody Employeemaster employee_master){
	employee_master.setEmp_id(emp_id);
	Employeemaster updatedata=service.update(employee_master);
	if (updatedata!=null) {
		return new ResponseEntity<>(updatedata,HttpStatus.OK);
	}else {
		return new ResponseEntity<>(updatedata,HttpStatus.NOT_FOUND);
	}
}


// Delete operation
@DeleteMapping("delete/{emp_id}")
public ResponseEntity<String> delete(@PathVariable Integer emp_id) {
    service.delete(emp_id);
    return new ResponseEntity<>("Data Delete Successfully", HttpStatus.NO_CONTENT);
}

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




	
}
