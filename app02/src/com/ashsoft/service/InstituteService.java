package com.ashsoft.service;

import com.ashsoft.beans.Student;

public interface InstituteService {
	public void enquiry(Student std,String courseName);
	public void registration(Student std,String courseName);
}
