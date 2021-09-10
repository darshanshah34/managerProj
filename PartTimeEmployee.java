package com.test.employee;

import java.util.Date;

public class PartTimeEmployee extends Employee implements EmployeeI {

	public PartTimeEmployee(boolean managerFlag, EmployeeType employeType, String name, Date dateHired, String id) {
		super(managerFlag, employeType, name, dateHired, id);
	}

	@Override
	public boolean isManager() {
		return false;
	}

	@Override
	public boolean isPartTime() {
		return false;
	}

	@Override
	public boolean getEmployeeType() {
		return false;
	}

}
