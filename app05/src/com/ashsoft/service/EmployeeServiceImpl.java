package com.ashsoft.service;

import com.ashsoft.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override   //Business methods
	public String addEmployee(Employee emp) throws Exception {
		System.out.println("Employee "+emp.getEno()+" Insertion success from addEmployee()method");
		return "Success";
	}

	@Override
	public Employee searchEmployee(int eno) {
		System.out.println("Employee "+eno+" searched from searchEmployee() method");
		return null;
	}

	@Override
	public String updateEmployee(Employee emp) {
		System.out.println("Employee "+emp.getEno()+" Updation success from updateEmployee()method");
		return "Success";
	}

	@Override
	public String deleteEmployee(Employee emp) {
		System.out.println("Employee "+emp.getEno()+" Deletion success from deleteEmployee()method");
		return "Success";
	}

}
