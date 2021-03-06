package com.cibus.cibusapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibus.cibusapp.models.Employee;
import com.cibus.cibusapp.repositories.EmployeeRepository;

@Service
public class EmployeeService {
		
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//Get All Employees
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}	
	
	//Get Employee By Id
	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}	
	
	//Delete Employee
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}
	
	//Update Employee
	public void save( Employee employee) {
		employeeRepository.save(employee);
	}
	
	//Get Employee by username
	public Employee findByUsername(String userName) {
		return employeeRepository.findByUsername(userName);
	}
}
