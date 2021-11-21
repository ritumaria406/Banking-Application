package com.greatlearning.service;

public class OtpGenerator {
	private int otp;
	public int GenerateOtp() {
		 otp =  (int)Math.random()* 9000;
		 return otp;
	}
}
