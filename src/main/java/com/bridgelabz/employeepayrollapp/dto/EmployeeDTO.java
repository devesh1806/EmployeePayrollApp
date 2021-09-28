package com.bridgelabz.employeepayrollapp.dto;

import lombok.Data;
public @Data class EmployeeDTO {
	private String name;
	private long salary;
	
	public EmployeeDTO(String name,long salary) {
		this.name= name;
		this.salary = salary;
	}
	
}
