package com.springheaven.yml.dto;

import java.util.List;

import com.springheaven.yml.dto.model.Employee;

public class EmployeeListContainerDTO {
	
	private List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	

}
