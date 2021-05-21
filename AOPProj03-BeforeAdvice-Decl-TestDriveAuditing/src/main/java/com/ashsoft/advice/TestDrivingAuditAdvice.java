package com.ashsoft.advice;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class TestDrivingAuditAdvice {
	
	/*public void testDriving(JoinPoint jp) throws Throwable{
		
		System.out.println("TestDrivingAuditAdvice.testDriving()");
		
		Object args[]=jp.getArgs();
		System.out.println(args[0]+" "+args[1]+" "+args[2]);
		
		String auditLogMsg=args[2]+" customer has come for test driving of "+args[0]+" model car on "+new Date();
		Writer writer = new FileWriter("G:\\testdrive_audit.txt",true); //auditlog file
		writer.write(auditLogMsg+"\n");
		writer.flush();
		writer.close();
	}
	*/
	
		public void testDriving(String custName, String carModel, double price) throws Throwable{
		
		System.out.println("TestDrivingAuditAdvice.testDriving()");
		
		String auditLogMsg=custName+" customer has come for test driving of "+carModel+" model car on "+new Date();
		
		
		Writer writer = new FileWriter("G:\\testdrive_audit.txt",true); //auditlog file
		writer.write(auditLogMsg+"\n");
		writer.flush();
		writer.close();
	}
}
