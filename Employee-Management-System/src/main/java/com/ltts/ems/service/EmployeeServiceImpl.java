package com.ltts.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.ems.model.Employeedetails;
import com.ltts.ems.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository emp;
	/**
	 *
	 */
	@Override
	public Employeedetails findByUsernameAndPassword(String username, String password) {
		return emp.findByUsernameAndPassword(username, password);
	}
	/**
	 *
	 */
	@Override
	public Employeedetails save(Employeedetails theemp) {
		return emp.save(theemp);
	}
	/**
	 *
	 */
	@Override
	public Employeedetails deleteById(int id) {
		
		return emp.deleteById(id);
		
	}
	@Override
	public List<Employeedetails> findAll() {
		
		return emp.findAll();
	}
	@Override
	public Employeedetails findById(int id) {
		return emp.findById(id);
	}
	

	
	

}
