package com.Question3;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empId;
	private String empName;
	private Address address = new Address("Maharashtra", "Pune", 411015);
	private String email;
	private transient String password;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Employee(int empId, String empName, String email, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		//this.address = address;
		this.email = email;
		this.password = password;
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name :"+getEmpName() + " Add : "+ address.getCity()+ ","+ address.getState() 
		+ "," + address.getPincode()+ " Emp Id : "+ getEmpId() 
				+ " Email : "+ getEmail() + " Pass : " + getPassword();
	}
	
	
}
