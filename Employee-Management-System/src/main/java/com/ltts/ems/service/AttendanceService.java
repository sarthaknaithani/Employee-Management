package com.ltts.ems.service;

import java.sql.Date;
import java.util.List;

import com.ltts.ems.model.Attendance_details;
import com.ltts.ems.model.Employeedetails;

public interface AttendanceService {
	public  List<Attendance_details> findAll();
	public Attendance_details save(Attendance_details amp);
	public  List<Attendance_details> findByID(Employeedetails theemp);
	int setStatusforattendance(String status, int id, Date markdate);
	
}
