package com.ashsoft.service;

import org.springframework.stereotype.Service;

@Service("store")
public class ShoppingStore {

	public double calcBillAmount(double price, double qty) {

		System.out.println("ShoppingStore.calcBillAmount()");
		
		if (price <= 0.0 || qty <= 0.0) {
			throw new IllegalArgumentException("Invalid Price and Quantity");
		} else {
			double billAmt = price * qty;
			return billAmt;
		}

	}
}
