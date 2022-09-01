package com.statics.pll;

import com.statics.bll.Account;

public class TestAccount {

	public static void main(String[] args) {
		
		Account acc1 = new Account("111111111111", "Ramesh", 5000);
		
		
		System.out.println(acc1);
		
		
		//System.out.println("No of accounts: " + acc1.getCount());
		
		Account acc2 = new Account("222222222222", "Vidya", 25000);
		
		System.out.println("*********************");
		System.out.println(acc2);
		
		//System.out.println("No of accounts: " + acc2.getCount());
		
		
		
		Account acc3 = new Account();
		
		System.out.println("*********************");
		System.out.println(acc3);
		
		//System.out.println("No of accounts: " + acc2.getCount());
		
		System.out.println("No of accounts: " + Account.getCount());
		
		/*
		Account acc4=null;
		
		System.out.println("No of accounts: " + acc4.getCount());
		*/
		
	}

}
