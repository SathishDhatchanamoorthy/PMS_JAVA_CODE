package com.hyundai.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "menu_master")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "menu_id")
	private int menuId;
	@Column(name = "menu_name")
	private String menuName;
	@Column(name = "accessibility")
	private String accessibility;
	@Column(name = "role_id")
	private int roleId;

}
