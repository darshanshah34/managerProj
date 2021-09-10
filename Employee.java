package com.test.employee;

import java.util.Date;

public class Employee {
	boolean managerFlag;
	EmployeeType employeType;
	String name;
	Date dateHired;
	String id;
	
	public Employee(boolean managerFlag, EmployeeType employeType, String name, Date dateHired, String id) {
		super();
		this.managerFlag = managerFlag;
		this.employeType = employeType;
		this.name = name;
		this.dateHired = dateHired;
		this.id = id;
	}

	public boolean isManagerFlag() {
		return managerFlag;
	}

	public void setManagerFlag(boolean managerFlag) {
		this.managerFlag = managerFlag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public EmployeeType getEmployeType() {
		return employeType;
	}

	public void setEmployeType(EmployeeType employeType) {
		this.employeType = employeType;
	}
}
