package com.example.server.employee_master_service;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.server.excelhelper.ExcelHelper;
import com.example.server.pms.entity.Department;
import com.example.server.pms.entity.Designation;
//import com.example.server.excelhelper.ExcelHelper;
import com.example.server.pms.entity.Employeemaster;
import com.example.server.pms.entity.Location;
import com.example.server.pms.entity.Manager;
import com.example.server.pms.entity.PmsResponseMessage;
import com.example.server.pms.entity.Team;
import com.example.server.pms.repositry.DepartmentRepo;
import com.example.server.pms.repositry.DesignationRepo;
import com.example.server.pms.repositry.Employeemasterrepo;
import com.example.server.pms.repositry.LocationRepo;
import com.example.server.pms.repositry.ManagerRepo;
import com.example.server.pms.repositry.TeamRepo;
import com.zaxxer.hikari.HikariDataSource;

import jakarta.persistence.EntityExistsException;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Service
public class Employeemasterservice {

	private HikariDataSource hikariDataSource;

	@Autowired
	private ExcelHelper excelHelper;

	@Autowired
	private ManagerRepo managerRepo;

	@Autowired
	private DepartmentRepo departmentRepo;

	@Autowired
	private TeamRepo teamRepo;

	@Autowired
	private Employeemasterrepo repo;
	
	@Autowired
	private LocationRepo locationRepo;
	
	@Autowired
	private DesignationRepo designationRepo;

	public Employeemasterservice(HikariDataSource hikariDataSource) {
		this.hikariDataSource = hikariDataSource;
	}

	public PmsResponseMessage getAll() {
		try {
			System.err.println("method is calling>>>>>>>>>>>>>>");
			List<Employeemaster> emp = repo.findAll();
			return new PmsResponseMessage(200, "Success", emp, true);
		} catch (Exception e) {
			e.printStackTrace();
			return new PmsResponseMessage(500, "Internal Server Error", null, false);
		}
	}

	public PmsResponseMessage create(Employeemaster employeemaster) {
		Optional<Employeemaster> existingEmployee = repo.findByEmail(employeemaster.getEmail());
		if (existingEmployee.isPresent()) {
			return new PmsResponseMessage(-1, "Mail Already Exists", existingEmployee, false);
		}
		Employeemaster createdEmployee = repo.save(employeemaster);
		return new PmsResponseMessage(201, "Data saved successfully", createdEmployee, true);

	}

	public PmsResponseMessage getAllManagers() {
		try {
			List<Manager> managerDTOs = managerRepo.findAll().stream()
					.map(man -> new Manager(man.getManagerId(), man.getManagerName())).collect(Collectors.toList());
			return new PmsResponseMessage(200, "Success", managerDTOs, true);
		} catch (Exception e) {
			e.printStackTrace();
			return new PmsResponseMessage(500, "Internal Server Error", null, false);
		}
	}

	public PmsResponseMessage getAllDepartments() {
		try {
			List<Department> departments = departmentRepo.findAll().stream().map(
					dept -> new Department(dept.getDeptId(), dept.getDeptName(), dept.getGrade()))
					.collect(Collectors.toList());
			return new PmsResponseMessage(200, "Success", departments, true);
		} catch (Exception e) {
			e.printStackTrace();
			return new PmsResponseMessage(500, "Internal Server Error", null, false);
		}

	}

	public PmsResponseMessage getAllTeams() {
		try {
			List<Team> teams = teamRepo.findAll().stream()
					.map(team -> new Team(team.getTeamId(), team.getTeamName(), team.getTeamGrade()))
					.collect(Collectors.toList());
			return new PmsResponseMessage(200, "Success", teams, true);
		} catch (Exception e) {
			e.printStackTrace();
			return new PmsResponseMessage(500, "Internal Server Error", null, false);
		}
	}
	
	public PmsResponseMessage getAllLocations() {
		try {
			List<Location> locations=locationRepo.findAll().stream().map(locate -> new Location(locate.getLocationId()
					,locate.getLocationName(),locate.getCity(),locate.getState(),locate.getCountry()
					,locate.getPostalCode(),locate.getDepartment())).collect(Collectors.toList());
			return new PmsResponseMessage(200, "Success", locations, true);
		}
		catch (Exception e) {
			e.printStackTrace();
			return new PmsResponseMessage(500, "Internal Server Error", null, false);
		}
	}
	
	public PmsResponseMessage getAllDesignations() {
		try {
			List<Designation> designation = designationRepo.findAll().stream()
					.map(designat -> new Designation(designat.getId(), designat.getDesignationName(),designat.getJobRole())).collect(Collectors.toList());
			return new PmsResponseMessage(200, "Success", designation, true);
		} catch (Exception e) {
			e.printStackTrace();
			return new PmsResponseMessage(500, "Internal Server Error", null, false);
		}
	}


	public Optional<Employeemaster> getById(Integer emp_id) {
		return repo.findById(emp_id);

	}

	// update data by praveen k
	public Employeemaster update(Employeemaster employeemaster) {
		if (repo.existsById(employeemaster.getEmp_id())) {
			return repo.save(employeemaster);
		} else {
			return null;
		}
	}

	// Delete operation by praveen k
	public void delete(Integer emp_id) {
		repo.deleteById(emp_id);
	}

	// Excell upload insert into database

//	public boolean insertEmployeeData(Employeemaster employee) {
//		String sql = "INSERT INTO employee_master (first_name, last_name, date_of_birth, hire_date, "
//				+ "designation_id, dept_id, manager_id, location_id, phone_number, "
//				+ "experience_id, team_id, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//
//		try (Connection connection = hikariDataSource.getConnection();
//				PreparedStatement statement = connection.prepareStatement(sql)) {
//
//			statement.setString(1, employee.getFirst_name());
//			statement.setString(2, employee.getLast_name());
//			statement.setString(3, (employee.getDate_of_birth()));
//			statement.setString(4, (employee.getHire_date()));
//			statement.setString(5, employee.getDesignation_id());
//			statement.setString(6, employee.getDept_id());
//			statement.setString(7, employee.getManager_id());
//			statement.setString(8, employee.getLocation_id());
//			statement.setString(9, employee.getPhone_number());
//			statement.setString(10, employee.getExperience_id());
//			statement.setString(11, employee.getTeam_id());
//			statement.setString(12, employee.getEmail());
//
//			int rowsAffected = statement.executeUpdate();
//
//			return rowsAffected > 0;
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}

	public static Date dateConversion(String date) {
		try {
			// Parse the string into a java.util.Date
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date utilDate = dateFormat.parse(date);

			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

			return sqlDate;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	public List<Employeemaster> processExcelFile(MultipartFile file)
			throws IOException, EncryptedDocumentException, ParseException {
		try {
			List<Employeemaster> employees = excelHelper.readExcelFile(file);
			employees = repo.saveAll(employees);

			return employees;
		} catch (IOException | EncryptedDocumentException e) {
			e.printStackTrace();
			throw e;
		}
	}

//	@Transactional
//    public List<EmployeeExcellDto> processExcelFile(MultipartFile file)
//            throws IOException, EncryptedDocumentException, ParseException {
//        try {
//            List<EmployeeExcellDto> employees = excelHelper.readExcelFile(file);
//            List<Employeemaster> entities = employees.stream()
//                    .map(EmployeeMapper::dtoToEntity)
//                    .collect(Collectors.toList());
//            entities = repo.saveAll(entities);
//
//            return entities.stream()
//                    .map(EmployeeMapper::entityToDto)
//                    .collect(Collectors.toList());
//        } catch (IOException | EncryptedDocumentException e) {
//            e.printStackTrace();
//            throw e;
//        }
//    }

//	@Autowired
//	private EmployeeExcelDtoRepo dtorepo;

	private static String getStringCellValue(Cell cell) {
		return cell == null ? null : cell.getStringCellValue();
	}

	private static Integer getIntegerCellValue(Cell cell) {
		return cell == null ? null : (int) cell.getNumericCellValue();
	}

}
