package com.ltts.ems.repository;


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ltts.ems.model.Attendance_details;
import com.ltts.ems.model.Employeedetails;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance_details,Integer>{
	public  List<Attendance_details> findAll();
	public  List<Attendance_details> findByID(Employeedetails theemp);
	@Transactional
	@Modifying
	@Query("update Attendance_details a set a.status = ?1 where a.ID.ID= ?2 and a.markdate = ?3")
	int setStatusforattendance(String status, int id, Date markdate);
}
