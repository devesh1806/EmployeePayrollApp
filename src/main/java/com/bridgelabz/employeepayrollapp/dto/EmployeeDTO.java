package com.bridgelabz.employeepayrollapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.Data;
public @Data class EmployeeDTO {
	
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Employee name Invalid")
	public String name;

	@Min(value=500,message="Min wage should be more than 500")
	private long salary;
	
	public EmployeeDTO(String name,long salary) {
		this.name= name;
		this.salary = salary;
	}
	
}
