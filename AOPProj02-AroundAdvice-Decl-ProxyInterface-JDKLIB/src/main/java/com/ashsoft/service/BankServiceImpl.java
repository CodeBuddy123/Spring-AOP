package com.ashsoft.service;

public class BankServiceImpl implements IBankService {

	public  final double calcSimpleInterest(double pAmt, double rate, double time) {

		System.out.println("BankService.calcSimpleInterest()");

		return (pAmt * rate * time) / 100.0f;
	}

   public  final double calcComInterest(double pAmt, double rate, double time) {
	   System.out.println("BankService.calcComInterest()");
	   
	   return (pAmt*Math.pow(1+rate/100, time))-pAmt;
   }
}
