package com.greatlearning.main;
import com.greatlearning.model.*;
import java.util.Scanner;

public class Driver {

	//Created a static object to fetch all inputs in this class
	private static Scanner input = new Scanner(System.in);
	
	private static Customer customer = new Customer("HDFT123453","password123");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayWelcomeMessage();
		
		//Checking for user credentials
		if(validateUserCredentials())
		{
			System.out.println("Successfully Authenticated");
			displayMenu();
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

