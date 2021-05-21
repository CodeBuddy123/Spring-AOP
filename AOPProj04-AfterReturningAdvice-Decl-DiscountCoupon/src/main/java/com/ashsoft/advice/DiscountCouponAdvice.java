package com.ashsoft.advice;

import java.io.FileWriter;
import java.io.Writer;

import org.aspectj.lang.JoinPoint;

public class DiscountCouponAdvice {
	
	public void generateCoupon(JoinPoint jp,double billAmt) throws Throwable
	{
		System.out.println("DiscountCouponAdvice.generateCoupon()");
		String couponMessage = null;
		if(billAmt>=50000)
		{
			couponMessage="Avail 30 percent discount on next purchase";
		}
		else if(billAmt>=30000)
		{
			couponMessage="Avail 15 percent discount on next purchase";
		}
		else
		{
			couponMessage="Avail 5 percent discount on next purchase";
		}
		//generate the coupon
		Writer writer = new FileWriter("G:\\coupon.txt",false);
		writer.write(couponMessage);
		writer.flush();
		writer.close();
	}
}
