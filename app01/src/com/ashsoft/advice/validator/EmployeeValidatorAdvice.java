package com.ashsoft.advice.validator;

import java.lang.reflect.Method;


import org.springframework.aop.MethodBeforeAdvice;

import com.ashsoft.beans.Employee;

public class EmployeeValidatorAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] params, Object target) throws Throwable {
		Employee emp=(Employee) params[0];
		System.out.println("Validation messages for "+m.getName());
		System.out.println("-------------------------------------");
		if(emp.getEno()<100 || emp.getEno()>999)
		{
			System.out.println("********Employee Number must be 3 digits********");
		}
		if(emp.getEsal()<20000 || emp.getEsal()>30000)
		{
			System.out.println("*********Employee Salary must be above 20k and below 30k");
		}
		if(!emp.getEmobile().startsWith("91-"))
		{
			System.out.println("*********Employee Mobile is Invalid*********");
		}
		if(!emp.getEemail().endsWith("@ashsoft.com"))
		{
			System.out.println("*********Employee Email is Invalid*********");
		}
	}
   
}
