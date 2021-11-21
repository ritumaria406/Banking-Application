package com.greatlearning.service;

import java.util.Scanner;

public class Banking {
	private int balance = 10000;
	private static Scanner input = new Scanner(System.in);
	private static OtpGenerator obj = new OtpGenerator();
	public void deposit(int amount)
	{
		if(amount>0)
		{
			balance = balance + amount;
			System.out.println("Successfully added amount "+amount+" current balance is "+balance);
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
		System.out.println("Successfully withdrawn amount "+amount+" current balance is "+balance);
		
	}
	
	public void transfer(int amount, String receiptAccountNumber) {
		if (amount >0 && amount>balance)
		{
			System.out.println("Insufficient balance");
			return;
		}
		int generateNewOTP = obj.GenerateOtp();
		System.out.println("The Otp Generated is "+ generateNewOTP);
		System.out.println("Enter the Otp");
		
		int otpEnteredByUser = input.nextInt();
		if(otpEnteredByUser == generateNewOTP)
		{
			balance = balance - amount;
			System.out.println("Successfully transfered amount "+amount+" current balance is "+balance);
		}
		else
		{
			
			System.out.println("Incorrect OTP");
		}
		
		
		
	}
}
