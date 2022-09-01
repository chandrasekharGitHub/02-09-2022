package com.statics.bll;

public class Account {
	private String id;
	private String name;
	private double balance;
	
	static private int count;
	
	public Account() {
		super();
		count++;
	}

	public Account(String id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		count++;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() { // read only property
		return balance;
	}
	
	public static int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + "\nName: " + name + "\nBalance: " + balance;
	}
	
	

}
