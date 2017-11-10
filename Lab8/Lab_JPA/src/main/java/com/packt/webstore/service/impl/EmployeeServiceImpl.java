package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findOne(id);
		
	}

	public void saveEmployee(Employee employeeToBeAdded) {
		
		employeeRepository.save(employeeToBeAdded);
		
	}

	public List<Employee> getEmployeeslist() {
		
		return (List<Employee>) employeeRepository.findAll();
	}

	public Employee locateOneEmployeeByHisNumber(int employeenum) {
		
		return employeeRepository.locateOneEmployeeByHisNumber(employeenum);
	}


	
}
