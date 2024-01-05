package com.sathish.angulartest.praveen;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaxxer.hikari.HikariDataSource;

@Service
public class Employeemasterservice {

	private HikariDataSource hikariDataSource;

//	@Autowired
//	private ExcelHelper excelHelper;

	public Employeemasterservice(HikariDataSource hikariDataSource) {
		this.hikariDataSource = hikariDataSource;
	}

	@Autowired
	private Employeemasterrepo repo;

	// creation method by praveen k
	public Employeemaster create(Employeemaster employee_master) {
		return repo.save(employee_master);
	}

	// Read data operation by praveen k
	public List<Employeemaster> getAll() {
		return repo.findAll();

	}

	public Optional<Employeemaster> getById(Integer emp_id) {
		return repo.findById(emp_id);

	}

	// update data by praveen k
	public Employeemaster update(Employeemaster employee_master) {
		if (repo.existsById(employee_master.getEmp_id())) {
			return repo.save(employee_master);
		} else {
			return null;
		}
	}

	// Delete operation by praveen k
	public void delete(Integer emp_id) {
		repo.deleteById(emp_id);
	}

	// Excell upload insert into database
//
//	public boolean insertEmployeeData(EmployeeExcellDto employee) {
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
//
//	public static Date dateConversion(String date) {
//		try {
//			// Parse the string into a java.util.Date
//			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//			java.util.Date utilDate = dateFormat.parse(date);
//
//			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
//
//			return sqlDate;
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	@Transactional
//	public List<EmployeeExcellDto> processExcelFile(MultipartFile file)
//			throws IOException, EncryptedDocumentException, ParseException {
//		try {
//			List<EmployeeExcellDto> employees = excelHelper.readExcelFile(file);
//			employees = repo.saveAll(employees);
//
//			return employees;
//		} catch (IOException | EncryptedDocumentException e) {
//			e.printStackTrace();
//			throw e;
//		}
//	}
//
//	private static String getStringCellValue(Cell cell) {
//		return cell == null ? null : cell.getStringCellValue();
//	}
//
//	private static Integer getIntegerCellValue(Cell cell) {
//		return cell == null ? null : (int) cell.getNumericCellValue();
//	}

}
