package com.bridgelabz.employeepayrollapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.exceptions.EmployeeException;
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
		return employeePayrollList.stream().filter(empData->empData.getEmp_id()==empId)
				.findFirst()
				.orElseThrow(()->new EmployeeException("Employee not found"));
	}

	@Override
	public EmployeeData createEmployee(EmployeeDTO empDTO) {
		EmployeeData employeeData= new EmployeeData(1,empDTO);
		employeePayrollList.add(employeeData);
		return employeeData;
	}

	@Override
	public EmployeeData updateEmployee(int empId, EmployeeDTO empPayrollDTO) {
		EmployeeData employeeData= getEmployeeById(empId);
		employeeData.setName(empPayrollDTO.getName());
		employeeData.setSalary(empPayrollDTO.getSalary());
		employeePayrollList.set(empId, employeeData);
		return employeeData;
	}

	@Override
	public void deleteEmployee(int empId) {
		employeePayrollList.remove(empId-1);
	}
}
