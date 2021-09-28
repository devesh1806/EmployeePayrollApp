package com.bridgelabz.employeepayrollapp.controller;

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

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@RequestMapping({"","/","/get"})
	public ResponseEntity<ResponseDTO> getEmployeeData(){
		EmployeeData employeeData;
		employeeData = new EmployeeData(1, new EmployeeDTO("Devesh", 3000.00));
		ResponseDTO res = new ResponseDTO("Get call Success", employeeData);
		return new ResponseEntity<ResponseDTO>(res,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeeData(@RequestBody EmployeeDTO empPayrollDTO)
	{
		EmployeeData employeeData=null;
		employeeData=new EmployeeData(3,empPayrollDTO);
		ResponseDTO respDTO=new ResponseDTO("Created Employee Payroll Data Sucessfully ",employeeData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update/{empId}") 
	public ResponseEntity<ResponseDTO> updateEmployeeData(@PathVariable("empId") int empId,@RequestBody EmployeeDTO empPayrollDTO){
		EmployeeData employeeData=null;
		employeeData=new EmployeeData(empId,empPayrollDTO);
		ResponseDTO respDTO=new ResponseDTO("Updates Employee Payroll Data Sucessfully",employeeData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);

		
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeeData(@PathVariable("empId") int emp_id){
		ResponseDTO respDTO=new ResponseDTO("Deleted Sucessfully","Deleted Id: "+emp_id);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
}
