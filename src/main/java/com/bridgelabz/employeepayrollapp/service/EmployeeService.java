package com.bridgelabz.employeepayrollapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeData;

@Service
public class EmployeeService implements IEmployeeService{
	
	private List<EmployeeData> employeePayrollList = new ArrayList<>();
	
	@Override
	public List<EmployeeData> getEmployeeData() {
		return employeePayrollList;
	}

	@Override
	public EmployeeData getEmployeeById(int empId) {
		EmployeeData employeeData=null;
		return employeeData;
	}

	@Override
	public EmployeeData createEmployee(EmployeeDTO empPayrollDTO) {
		EmployeeData employeeData=null;
		return employeeData;
	}

	@Override
	public EmployeeData updateEmployee(int empId, EmployeeDTO empPayrollDTO) {
		EmployeeData employeeData=null;
		return employeeData;
	}

	@Override
	public void deleteEmployee(int empId) {
		
	}
}
