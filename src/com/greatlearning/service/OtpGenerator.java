package com.greatlearning.service;
import java.lang.Math; 

public class OtpGenerator {
	private int otp;
	public int GenerateOtp() {
		 otp =  (int) (Math.random()* 9000);
		 return otp;
	}
}
