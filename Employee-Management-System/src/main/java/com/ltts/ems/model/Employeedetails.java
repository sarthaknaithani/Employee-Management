package com.ltts.ems.model;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Employeedetails")
public class Employeedetails {
	
	    @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int ID;
	    private String username;
	    private Date DoJ;
		private String Role;
		
		private String Img;
		private String password;
		private String FirstName;
		private String LastName;
		private String EmployeeNumber;
		private Date Dob;
		private String Gender;
		
		public String getUsername() {
			return username;
		}



		public void setUsername(String username) {
			this.username = username;
		}



		
		public int getID() {
			return ID;
		}



		/**
		 * @param iD
		 */
		public void setID(int iD) {
			ID = iD;
		}



		
		
		/**
		 * @return
		 */
		public String getPassword() {
			return password;
		}



		/**
		 * @param password
		 */
		public void setPassword(String password) {
			this.password = password;
		}



		public Employeedetails() {
			super();
		}

	



		public Employeedetails(String username, String firstName, String lastName, String employeeNumber, Date dob,
				String gender, Date doJ, String role, String img, String password) {
			super();
			this.username = username;
			FirstName = firstName;
			LastName = lastName;
			EmployeeNumber = employeeNumber;
			Dob = dob;
			Gender = gender;
			DoJ = doJ;
			Role = role;
			Img = img;
			this.password = password;
		}



		/**
		 * @return
		 */
		public String getFirstName() {
			return FirstName;
		}
		/**
		 * @param firstName
		 */
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		/**
		 * @return
		 */
		public String getLastName() {
			return LastName;
		}
		/**
		 * @param lastName
		 */
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		/**
		 * @return
		 */
		public Date getDob() {
			return Dob;
		}
		/**
		 * @param dob
		 */
		public void setDob(Date dob) {
			Dob = dob;
		}
		
	
		/**
		 * @return
		 */
		public String getEmployeeNumber() {
			return EmployeeNumber;
		}

		/**
		 * @param employeeNumber
		 */
		public void setEmployeeNumber(String employeeNumber) {
			EmployeeNumber = employeeNumber;
		}

		/**
		 * @return
		 */
		public String getGender() {
			return Gender;
		}
		/**
		 * @param gender
		 */
		public void setGender(String gender) {
			Gender = gender;
		}
		/**
		 * @return
		 */
		public Date getDoJ() {
			return DoJ;
		}
		/**
		 * @param doJ
		 */
		public void setDoJ(Date doJ) {
			DoJ = doJ;
		}
		/**
		 * @return
		 */
		public String getRole() {
			return Role;
		}
		/**
		 * @param role
		 */
		public void setRole(String role) {
			Role = role;
		}
		
		/**
		 * @return
		 */
		public String getImg() {
			return Img;
		}

		/**
		 * @param img
		 */
		public void setImg(String img) {
			Img = img;
		}



		@Override
		public String toString() {
			return "Employeedetails [ID=" + ID + ", FirstName=" + FirstName + ", LastName=" + LastName
					+ ", EmployeeNumber=" + EmployeeNumber + ", Dob=" + Dob + ", Gender=" + Gender + ", DoJ=" + DoJ
					+ ", Role=" + Role + ", Img=" + Img + "]";
		}
		
		
		
}
