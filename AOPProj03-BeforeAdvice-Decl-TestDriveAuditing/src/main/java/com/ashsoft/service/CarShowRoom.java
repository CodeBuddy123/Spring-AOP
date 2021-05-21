package com.ashsoft.service;

public class CarShowRoom {

	public String sellCar(String carModel, double price, String custName) {
		
		System.out.println("CarShowRoom.sellCar()");
		if (carModel.equalsIgnoreCase("beleano")) {
			return "Car " + carModel + " is sold out at price::" + price + " to customer::" + custName;
		} else {
			return "Car " + carModel + " is not available for sale";
		}
	}
}
