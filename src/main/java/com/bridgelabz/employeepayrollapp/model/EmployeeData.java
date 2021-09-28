package com.bridgelabz.employeepayrollapp.model;

public class EmployeeData {
	private Integer emp_id;
	private String name;
	private Double salary;
	
	public EmployeeData(Integer emp_id,String name,Double salary) {
		this.emp_id = emp_id;
		this.name= name;
		this.salary = salary;
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
