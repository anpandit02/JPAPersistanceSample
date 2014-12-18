package com.anirudh.entities;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {
	
	   private int employee_id;
	   private String first_name;
	   private String last_name;
	   private String department;
	   private String job_title;
	   private String employee_type;
	   private Timestamp start_date;
	   private String status;
	   private String email;
	   
	 
	  public Employee() {
	      super();
	   }
	  
	  public Employee(int employee_id, String first_name, String last_name, String department, String job_title, String employee_type, Timestamp start_date, String status, String email) {
	      
		  super();
	      
	      this.employee_id=employee_id;
		  this.first_name=first_name;
		  this.last_name=last_name;
		  this.department=department;
		  this.job_title=job_title;
		  this.employee_type=employee_type;
		  this.start_date=start_date;
		  this.status=status;
		  this.email=email;
	   }
	  
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  public int getEmployee_id() {
			return employee_id;
		}

		public void setEmployee_id(int employee_id) {
			this.employee_id = employee_id;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getJob_title() {
			return job_title;
		}

		public void setJob_title(String job_title) {
			this.job_title = job_title;
		}

		public String getEmployee_type() {
			return employee_type;
		}

		public void setEmployee_type(String employee_type) {
			this.employee_type = employee_type;
		}

		public Timestamp getStart_date() {
			return start_date;
		}

		public void setStart_date(Timestamp start_date) {
			this.start_date = start_date;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		@Override
		public String toString() {
			return "Employee [employee_id=" + employee_id + ", first_name=" + first_name +" last_name=" + last_name + " department= "+ department + "job_title= " + job_title +"employee_type= "+ employee_type + "start_date= " + start_date + "employee_type= " + employee_type + "email= " + email +"]";
		}


}
