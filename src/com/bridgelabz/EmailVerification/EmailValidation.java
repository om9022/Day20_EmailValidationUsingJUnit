package com.bridgelabz.EmailVerification;

public class EmailValidation {
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Email Validation");
		//uc1 - email should start with letters or number
		EmailValidationService emailCheck1 = new EmailValidationService();
		String str1 = "abc";
		emailCheck1.checkFirstLetter(str1);

		//uc2 - Ensure @ and validate the mandatory 2nd part
		EmailValidationService emailCheck2 = new EmailValidationService();
		String str2 = "@bridgelabz";
		emailCheck2.checkDomainName(str2);

		//uc3 - Ensure . and validate the mandatory 3rd part
		EmailValidationService emailCheck3 = new EmailValidationService();
		String str3 = ".co";
		emailCheck3.checkTLD(str3);

		//uc4 - To check optional user name to be correct
		EmailValidationService emailCheck4 = new EmailValidationService();
		String str4 = ".xyz";
		emailCheck4.checkOptionalUserName(str4);

		//uc5- To check optional domain name 
		EmailValidationService emailCheck5 = new EmailValidationService();
		String str5 = ".in";
		emailCheck5.checkOptionalDomainName(str5);

		//verifying a email id by merging all the use cases
		EmailValidationService emailCheck = new EmailValidationService();
		String emailAddress = "abc.xyz@bridgelabz.co.in";
		emailCheck.checkFullEmailAddress(emailAddress);		
	}
}
