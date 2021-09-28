package com.bridgelabz.employeepayrollapp.service;

import java.util.List;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeData;

public interface IEmployeeService {

	List<EmployeeData> getEmployeeData();

	EmployeeData getEmployeeById(int empId);

	EmployeeData createEmployee(EmployeeDTO empPayrollDTO);

	EmployeeData updateEmployee(int empId, EmployeeDTO empDTO);

	void deleteEmployee(int emp_id);

}
