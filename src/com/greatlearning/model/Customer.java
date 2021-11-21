package com.greatlearning.model;

public class Customer {
	private String bankAccountNo;
	private String password;
	
	// Assign values to data members
	//We use constructors	
	public Customer(String bankAccountNo,String password)
	{
		this.bankAccountNo = bankAccountNo;
		this.password = password;
	}
	
	//Getter and setter for Bank account number
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	//Getter and setter for Password
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
