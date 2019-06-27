package com.ashsoft.service;

import com.ashsoft.beans.Student;

public class InstituteServiceImpl implements InstituteService {

	@Override
	public void enquiry(Student std, String courseName) {
		System.out.println("Student Enquiry Details");
		System.out.println("------------------------------");
		System.out.println("Student Name          :"+std.getSname());
		System.out.println("Student Qualification :"+std.getSqual());
		System.out.println("Student Email         :"+std.getSemail());
		System.out.println("Student Mobile        :"+std.getSmobile());
		System.out.println("Student Course        :"+courseName);
	}

	@Override
	public void registration(Student std, String courseName) {
		System.out.println("Student Registration Details");
		System.out.println("------------------------------");
		System.out.println("Student Name          :"+std.getSname());
		System.out.println("Student Qualification :"+std.getSqual());
		System.out.println("Student Email         :"+std.getSemail());
		System.out.println("Student Mobile        :"+std.getSmobile());
		System.out.println("Student Course        :"+courseName);

	}

}
