package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	public String addEmployee(Employee employee) {
		
		repository.save(employee);
		return "Employee is Registered Successfully";
	}

	public Employee findEmployeeById(int employeeId) {
		Optional<Employee> optional = repository.findById(employeeId);
		return optional.get();
	}

	public Employee updateEmployeeById(Employee employee) {
	Employee emp = findEmployeeById(employee.getEmployeeId());
	emp.setEmployeeName(employee.getEmployeeName());
	emp.setEmplyeeRole(employee.getEmployeeRole());
	emp.setSalary(employee.getSalary());
	Employee saveEmployee = repository.save(emp);
		return saveEmployee;
	}

	public String deleteEmployee(int employeeId) {
		Optional<Employee> optional = repository.findById(employeeId);
		if(optional.isPresent()) {
			repository.delete(optional.get());
			return "Employee Deleted Successfully";
		}
		return "Employee is not present in the DataBase";
		
	}

	public List<Employee> findAllEmployees() {
		return repository.findAll();
	}





}
