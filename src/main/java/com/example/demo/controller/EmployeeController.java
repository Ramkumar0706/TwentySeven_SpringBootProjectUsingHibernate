package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/addEmployee")	
	public String addEmplyee(@RequestBody Employee employee) {
		return  service.addEmployee(employee);
	}

	@GetMapping("/employee/{employeeId}")
	public Employee findEmployeeById(@PathVariable int employeeId) {
		return service.findEmployeeById(employeeId);
	}
	
	@PutMapping("/employees/updateEmployee")
	public Employee updateEmployeeById(@RequestBody Employee employee) {
		return service.updateEmployeeById(employee);
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		return service.deleteEmployee(employeeId);
	}
	
	@GetMapping("/allEmployees")
	public List<Employee> findAllEmployees(){
		return service.findAllEmployees();
	}
}
