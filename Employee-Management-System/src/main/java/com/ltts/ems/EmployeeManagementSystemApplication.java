package com.ltts.ems;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ltts.ems.controller.EmployeeController;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		
		new File(EmployeeController.uploadDirectory).mkdir();
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

}
