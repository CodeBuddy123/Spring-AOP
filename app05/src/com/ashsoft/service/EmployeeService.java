package com.ashsoft.service;

import com.ashsoft.beans.Employee;

public interface EmployeeService {
	public String addEmployee(Employee emp) throws Exception;
	public Employee searchEmployee(int eno);
	public String updateEmployee(Employee emp);
	public String deleteEmployee(Employee emp);
}
