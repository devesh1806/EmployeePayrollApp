package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;

public class EmployeeData {
	
	private Integer emp_id;
	private String name;
	private Double salary;
	
	public EmployeeData(Integer emp_id,EmployeeDTO dataDTO) {
		this.emp_id = emp_id;
		this.name= dataDTO.getName();
		this.salary = dataDTO.getSalary();
	}
	public Integer getEmpID() {
		return emp_id;
	}
	public void setEmpID(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
