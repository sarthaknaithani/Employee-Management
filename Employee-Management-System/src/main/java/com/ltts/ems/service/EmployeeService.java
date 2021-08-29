package com.ltts.ems.service;



import java.util.List;

import com.ltts.ems.model.Employeedetails;

public interface EmployeeService {
	public Employeedetails findById(int id);
/**
 * @return
 */
public List<Employeedetails> findAll();
/**
 * @param username
 * @param password
 * @return
 */
public Employeedetails findByUsernameAndPassword(String username, String password);

/**
 * @param theemp
 * @return
 */
public Employeedetails save(Employeedetails theemp);

/**
 * @param id
 * @return
 */
public Employeedetails deleteById(int id);
}
