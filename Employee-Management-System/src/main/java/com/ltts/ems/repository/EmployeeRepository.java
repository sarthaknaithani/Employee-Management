package com.ltts.ems.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.ltts.ems.model.Employeedetails;




@Repository
public interface EmployeeRepository extends JpaRepository<Employeedetails,Integer> {
	
	public Employeedetails findById(int id);

	  /**
	 * @param username
	 * @param password
	 * @return
	 */
	public Employeedetails findByUsernameAndPassword(String username, String password);
	
	  
	  public <S extends Employeedetails>Employeedetails save(Employeedetails theemp);
	  
	  
	  /**
	 * @param id
	 * @return
	 */
	public Employeedetails deleteById(int id);
	  
	
	
}






