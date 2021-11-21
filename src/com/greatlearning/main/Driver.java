package com.greatlearning.main;
import com.greatlearning.model.*;
import com.greatlearning.service.*;
import java.util.Scanner;

public class Driver {

	//Created a static object to fetch all inputs in this class
	private static Scanner input = new Scanner(System.in);
	
	private static Customer customer = new Customer("HDFT123453","password123");
	private static Banking bank = new Banking();
	
	public static void main(String[] args) {
		int amount;
		int choice;
		// TODO Auto-generated method stub
		displayWelcomeMessage();
		
		//Checking for user credentials
		if(validateUserCredentials())
		{
			System.out.println("Successfully Authenticated");
			displayMenu();
			
			do
			{
			System.out.println("Enter your choice");
			
			 choice = input.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("Enter the amount to deposit");
			amount = input.nextInt();
			
			bank.deposit(amount);
			break;
			case 2: System.out.println("Enter the amount to withdraw");
			amount = input.nextInt();
			
			bank.withdraw(amount);
			break;
			case 3: System.out.println("Enter the amount to transfer");
			amount = input.nextInt();
			System.out.println("Enter the AC of the recipient");
			String receiptAcNumber = input.next();
			bank.transfer(amount,receiptAcNumber);
			break;
			}
			}while(choice!=4);
		}
		else
		{
			System.out.println("Invalid Bank Account Number and Password");
		}
		
	}
	private static void displayWelcomeMessage() {
		System.out.println("Welcome to SBI Bank");
	}
	
	private static boolean validateUserCredentials() {
		System.out.println("Enter Bank Account Number:");
		
		String bankAccountNumber = input.nextLine();
		
		System.out.println("Enter Password:");
		
		String password = input.nextLine();
		
		return (customer.getBankAccountNo().equals(bankAccountNumber) && customer.getPassword().equals(password));
		
		}
	
	private static void displayMenu()
	{
		System.out.println("------------------------------");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Transfer");
		System.out.println("4. Log out");		
		System.out.println("------------------------------");
	}
}

