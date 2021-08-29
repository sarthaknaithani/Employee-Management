package com.ltts.ems.model;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Attendance_details")
public class Attendance_details {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        
        private int task;
        @ManyToOne 
        @JoinColumn(name="empid")
        private Employeedetails ID;
        private String activity;
        private String phase;
        private Date markdate;
       // private String day;
        private int hours;
        private String status="Pending";
        public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		private String location;
		public Employeedetails getID() {
			return ID;
		}
		public void setID(Employeedetails iD) {
			ID = iD;
		}
		public int getTask() {
			return task;
		}
		public void setTask(int task) {
			this.task = task;
		}
		public String getActivity() {
			return activity;
		}
		public void setActivity(String activity) {
			this.activity = activity;
		}
		public String getPhase() {
			return phase;
		}
		public void setPhase(String phase) {
			this.phase = phase;
		}
		public Date getMarkdate() {
			return markdate;
		}
		public void setMarkdate(Date markdate) {
			this.markdate = markdate;
		}
		
		
		public int getHours() {
			return hours;
		}
		public void setHours(int hours) {
			this.hours = hours;
		}
		public String getLocation() {
			return location;
		}
		
		public void setLocation(String location) {
			this.location = location;
		}
		public Attendance_details() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Attendance_details(int task, Employeedetails iD, String activity, String phase, Date markdate,
				 int hours, String status, String location) {
			super();
			this.task = task;
			ID = iD;
			this.activity = activity;
			this.phase = phase;
			this.markdate = markdate;
			//this.day = day;
			this.hours = hours;
			this.status = status;
			this.location = location;
		}
		@Override
		public String toString() {
			return "Attendance_details [task=" + task + ", activity=" + activity + ", phase=" + phase + ", markdate="
					+ markdate + ", hours=" + hours + ", location=" + location + "]";
		}
        
        
          
        
        
}
