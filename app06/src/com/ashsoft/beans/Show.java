package com.ashsoft.beans;

import lombok.Data;

@Data  //Using this annotation which gives setters and getters from lombok jar file

public class Show {
	private String name;
	private String time;
	private int price;

}