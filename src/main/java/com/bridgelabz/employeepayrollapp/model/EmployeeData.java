package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;

import lombok.Data;

public @Data class EmployeeData {
	
	private Integer emp_id;
	private String name;
	private long salary;
	
	public EmployeeData(Integer emp_id,EmployeeDTO dataDTO) {
		this.emp_id = emp_id;
		this.name= dataDTO.getName();
		this.salary = dataDTO.getSalary();
	}	
}
