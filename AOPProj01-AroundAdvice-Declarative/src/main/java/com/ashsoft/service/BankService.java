package com.ashsoft.service;

public class BankService {

	public double calcSimpleInterest(double pAmt, double rate, double time) {

		System.out.println("BankService.calcSimpleInterest()");

		return (pAmt * rate * time) / 100.0f;
	}

   public double calcComInterest(double pAmt, double rate, double time) {
	   System.out.println("BankService.calcComInterest()");
	   
	   return (pAmt*Math.pow(1+rate/100, time))-pAmt;
   }
}
