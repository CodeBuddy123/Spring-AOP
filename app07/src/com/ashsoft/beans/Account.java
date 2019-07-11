package com.ashsoft.beans;

import lombok.Data;

@Data
public class Account {
	private String accNo;
	private String accName;
	private String accType;
	private int balance;
}
