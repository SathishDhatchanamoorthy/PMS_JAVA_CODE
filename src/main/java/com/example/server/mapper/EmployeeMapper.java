//package com.example.server.mapper;
//
//import com.example.server.pms.entity.EmployeeExcellDto;
//import com.example.server.pms.entity.Employeemaster;
//
//public class EmployeeMapper {
//	public static Employeemaster dtoToEntity(EmployeeExcellDto dto) {
//		Employeemaster entity = new Employeemaster();
//        entity.setFirst_name(dto.getFirst_name());
//        entity.setLast_name(dto.getLast_name());
//        entity.setDate_of_birth(dto.getDate_of_birth());
//        entity.setHire_date(dto.getHire_date());
//        int designationId = Integer.parseInt(String.valueOf(dto.getDesignation_id()));
//        entity.setDesignation_id(designationId);
//        int deptId = Integer.parseInt(String.valueOf(dto.getDept_id()));
//        entity.setDept_id(deptId);
//        int managerId = Integer.parseInt(String.valueOf(dto.getManager_id()));
//        entity.setManager_id(managerId);
//        int locationId = Integer.parseInt(String.valueOf(dto.getLocation_id()));
//        entity.setLocation_id(locationId);
//        entity.setPhone_number(dto.getPhone_number());
//        int experienceid = Integer.parseInt(String.valueOf(dto.getExperience_id()));
//        entity.setExperience_id(experienceid);
//        int teamid = Integer.parseInt(String.valueOf(dto.getTeam_id()));
//        entity.setTeam_id(teamid);
//        entity.setEmail(dto.getEmail());
//        return entity;
//    }
//
//    public static EmployeeExcellDto entityToDto(Employeemaster entity) {
//        EmployeeExcellDto dto = new EmployeeExcellDto();
//        dto.setFirst_name(entity.getFirst_name());
//        dto.setLast_name(entity.getLast_name());
//        dto.setDate_of_birth(entity.getDate_of_birth());
//        dto.setHire_date(entity.getHire_date());
//        dto.setDesignation_id(String.valueOf(entity.getDesignation_id()));       
//        dto.setDept_id(String.valueOf(entity.getDept_id()));  
//        dto.setManager_id(String.valueOf(entity.getManager_id()));  
//        dto.setLocation_id(String.valueOf(entity.getLocation_id()));  
//        dto.setPhone_number(entity.getPhone_number());  
//        dto.setExperience_id(String.valueOf(entity.getExperience_id()));
//        dto.setTeam_id(String.valueOf(entity.getTeam_id()));
//        dto.setEmail(entity.getEmail());
//        
//        
//        return dto;
//    }
//}
