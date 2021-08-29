package com.ltts.ems.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.ems.model.Attendance_details;
import com.ltts.ems.model.Employeedetails;
import com.ltts.ems.repository.AttendanceRepository;

@Service
public class AttendanceServiceImpl implements AttendanceService{

	@Autowired
	AttendanceRepository apr;
	
	
	public Attendance_details save(Attendance_details amp) {
		return apr.save(amp);
	}


	@Override
	public List<Attendance_details> findByID(Employeedetails theemp) {
		return apr.findByID(theemp);
	}


	@Override
	public int setStatusforattendance(String status, int id, Date markdate) {
		return apr.setStatusforattendance(status, id, markdate);
	}


	@Override
	public List<Attendance_details> findAll() {
		
		return apr.findAll();
	}
	
}
