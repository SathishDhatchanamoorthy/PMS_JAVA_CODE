package com.sathish.angulartest.thahira.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoleMaster {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long roleId;
		
		@Column
	    private String roleName;
	    
	    
	    
		public Long getRoleId() {
			return roleId;
		}
		public void setRoleId(Long roleId) {
			this.roleId = roleId;
		}
		public String getRoleName() {
			return roleName;
		}
		
		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}
		
		@Override
		public String toString() {
			return "RoleMaster [roleId=" + roleId + ", roleName=" + roleName + "]";
		}
	    

}
