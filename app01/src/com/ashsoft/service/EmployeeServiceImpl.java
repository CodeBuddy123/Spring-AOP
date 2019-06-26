package com.ashsoft.service;

import com.ashsoft.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Override
	public void getEmployeeDetails(Employee emp) {
		System.out.println("Employee Details from getEmployeeDetails() method");
		System.out.println("------------------------------------------------------");
		System.out.println("Employee No       :"+emp.getEno());
		System.out.println("Employee Name     :"+emp.getEname());
		System.out.println("Employee Salary   :"+emp.getEsal());
		System.out.println("Employee Address  :"+emp.getEaddr());
		System.out.println("Employee Mobile   :"+emp.getEmobile());
		System.out.println("Employee Email    :"+emp.getEemail());
		
	}  

	@Override
	public void displayEmployeeDetails(Employee emp) {
		
		System.out.println("Employee Details from displayEmployeeDetails() method");
		System.out.println("------------------------------------------------------");
		System.out.println("Employee No       :"+emp.getEno());
		System.out.println("Employee Name     :"+emp.getEname());
		System.out.println("Employee Salary   :"+emp.getEsal());
		System.out.println("Employee Address  :"+emp.getEaddr());
		System.out.println("Employee Mobile   :"+emp.getEmobile());
		System.out.println("Employee Email    :"+emp.getEemail());
	}

}
