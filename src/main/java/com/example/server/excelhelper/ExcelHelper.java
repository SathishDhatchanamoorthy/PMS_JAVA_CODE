package com.example.server.excelhelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.server.pms.entity.Employeemaster;

@Service
public class ExcelHelper {

	private static String getStringCellValue(Cell cell) {
		return cell == null ? null : cell.toString();
	}


	public List<Employeemaster> readExcelFile(MultipartFile file) throws EncryptedDocumentException, IOException {
		try (InputStream is = file.getInputStream(); Workbook workbook = WorkbookFactory.create(is)) {

			List<Employeemaster> employees = new ArrayList<>();
			org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0); 
			Iterator<Row> rowIterator = sheet.iterator();
			if (rowIterator.hasNext()) {
				Row headerRow = rowIterator.next();
				List<String> columnHeaders = getColumnHeaders(headerRow);

				while (rowIterator.hasNext()) {
					Row row = rowIterator.next();
					Employeemaster employee = mapRowToEmployee(row, columnHeaders);
					employees.add(employee);
				}
			}

			return employees;
		}
	}

	private List<String> getColumnHeaders(Row headerRow) {
		List<String> columnHeaders = new ArrayList<>();
		headerRow.forEach(cell -> columnHeaders.add(cell.getStringCellValue()));
		return columnHeaders;
	}

	
//	private Date convertStringToDate(String dateString) throws ParseException {
//	    if (dateString != null && !dateString.isEmpty()) {
//	        System.out.println("Original date string: " + dateString);
//	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//	        return  (Date) dateFormat.parse(dateString);
//	    }
//	    return null;
//	}

	
	
	

	// Similar changes for other fields

	
	private Employeemaster mapRowToEmployee(Row row, List<String> columnHeaders) {
		Employeemaster employee = new Employeemaster();
		for (int i = 0; i < row.getLastCellNum(); i++) {
			String columnHeader = columnHeaders.get(i);
			Cell cell = row.getCell(i);

			switch (columnHeader.toLowerCase()) {
			
			case "first_name":
				employee.setFirst_name(getStringCellValue(cell));
				break;
			case "last_name":
				employee.setLast_name(getStringCellValue(cell));
				break;
			case "dob":
			    employee.setDate_of_birth(getStringCellValue(cell));
			    break;
			case "hire_date":
			    employee.setHire_date(getStringCellValue(cell));
			    break;			
//			case "designation_id":
//                employee.setDesignation_id(getStringCellValue(cell));
//                break;
//            case "dept_id":
//                employee.setDept_id(getStringCellValue(cell));
//                break;
//            case "manager_id":
//                employee.setManager_id(getStringCellValue(cell));
//                break;
//            case "location_id":
//                employee.setLocation_id(getStringCellValue(cell));
//                break;
//            case "phone_number":
//            	employee.setPhone_number(getStringCellValue(cell));
//                break;
//            case "experience_id":
//                employee.setExperience_id(getStringCellValue(cell));
//                break;
//            case "team_id":
//                employee.setTeam_id(getStringCellValue(cell));
//                break;
          
				
//				
//			case "designation_id":
//            case "dept_id":
//            case "manager_id":
//            case "location_id":
//            case "experience_id":
//            case "team_id":
//                try {
//                    employee.setNumericProperty(columnHeader, cell);
//                } catch (NumberFormatException e) {
//                 
//                    e.printStackTrace();
//                }
				
            case "email":
				employee.setEmail(getStringCellValue(cell));
				break;

            default:
              
                break;
		
			
				
			}
		}
		
		System.err.println("=============> "+employee.toString());
		return employee;
		
		
	}

}
