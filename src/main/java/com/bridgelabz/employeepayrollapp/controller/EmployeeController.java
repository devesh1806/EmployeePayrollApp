package com.bridgelabz.employeepayrollapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeData;
import com.bridgelabz.employeepayrollapp.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	
	@Autowired
	public IEmployeeService employeeService;
	
	@RequestMapping({"","/","/get"})
	public ResponseEntity<ResponseDTO> getEmployeeData(){
		List<EmployeeData> employeeData = employeeService.getEmployeeData();
		ResponseDTO res = new ResponseDTO("Get call Success", employeeData);
		return new ResponseEntity<ResponseDTO>(res,HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId){
		EmployeeData employeeData=employeeService.getEmployeeById(empId);
		ResponseDTO respDTO=new ResponseDTO("Get call Success",employeeData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	
	}
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeeData(@Valid @RequestBody EmployeeDTO empPayrollDTO)
	{
		EmployeeData employeeData = employeeService.createEmployee(empPayrollDTO);
		ResponseDTO respDTO=new ResponseDTO("Created Employee Payroll Data Sucessfully ",employeeData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update/{empId}") 
	public ResponseEntity<ResponseDTO> updateEmployeeData(@PathVariable("empId") int empId,@Valid @RequestBody EmployeeDTO empDTO){
		EmployeeData employeeData = employeeService.updateEmployee(empId,empDTO);
		ResponseDTO respDTO=new ResponseDTO("Updates Employee Payroll Data Sucessfully",employeeData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);

		
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeeData(@PathVariable("empId") int emp_id){
		employeeService.deleteEmployee(emp_id);
		ResponseDTO respDTO=new ResponseDTO("Deleted Sucessfully","Deleted Id: "+emp_id);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
}
