package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String employeeName;
	private int salary;
	private String employeeRole;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setEmplyeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	
	

}
