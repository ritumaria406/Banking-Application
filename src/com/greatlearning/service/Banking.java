package com.greatlearning.service;

public class Banking {
	private int balance = 10000;
	
	public void deposit(int amount)
	{
		if(amount>0)
		{
			balance = balance + amount;
			System.out.println("Successfully added amount"+amount+" current balance is "+balance);
		}
	}
	public void withdraw(int amount)
	{
		if(amount>balance)
		{			
			System.out.println("Insufficient balance");
			return;
		}
		
		balance = balance - amount;
		System.out.println("Successfully withdrawn amount"+amount+" current balance is "+balance);
		
	}
}
