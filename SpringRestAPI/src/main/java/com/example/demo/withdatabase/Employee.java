package com.example.demo.withdatabase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Emp_Id")
	private int id;
//	@Column(name = "Emp_Name")
	private String name;
	@Column(name = "Emp_City")
	private String city;
	@Column(name = "Emp_Salary")
	private int salary;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, String city, int salary) {
		super();
		
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	
	
	
	
	
	
	
	
	
}
