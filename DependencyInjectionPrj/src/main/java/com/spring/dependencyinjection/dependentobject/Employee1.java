package com.spring.dependencyinjection.dependentobject;

public class Employee1 {
	
		private int id; 
		private String name; 
		private Address address;//Aggregation 
		 
			public Employee1(int id, String name, Address address) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			}

			   public void show() {
				System.out.println("Emp id: " +id );
				System.out.println("Empname:" + name);
				System.out.println("Address of: " +address.toString());
		}
	}
