package com.bridgelabz.EmailVerification;

import java.util.regex.Pattern;

public class EmailValidationService {
	// method to verify a full email address 
			public boolean checkFullEmailAddress(String emailAddress)
			{
				boolean isMatched = Pattern.compile("^[0-9a-zA-Z]+([.,+,_,-]{1}[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2})?").matcher(emailAddress).matches();
				return isMatched;
			}

			//check optional domain name should start with . and have only 2 letters 
			public boolean checkOptionalDomainName(String str5) 
			{
				boolean isMatched = Pattern.compile("([.]{1}[a-zA-Z]{2})?").matcher(str5).matches();
				return isMatched;
			}

			// check optional user name that it should start with [ +,-, ., _ ] and then have letters or numbers  
			public boolean checkOptionalUserName(String str4) 
			{
				boolean isMatched = Pattern.compile("(^[.,+,_,-]{1}[0-9a-zA-Z]+)*").matcher(str4).matches();
				return isMatched;
			}

			//check email TDL should have "." and TDL
			public boolean checkTLD(String str3) 
			{
				boolean isMatched = Pattern.compile(".[a-zA-Z]{2,3}").matcher(str3).matches();
				return isMatched;
			}

			//check email should have @ and have domain name
			public boolean checkDomainName(String str2)
			{
				boolean isMatched = Pattern.compile("@[0-9a-zA-Z]+").matcher(str2).matches();
				return isMatched;
			}

			//check email should start with letters or number 
			public boolean checkFirstLetter(String str)
			{
				boolean isMatched = Pattern.compile("^[0-9a-zA-Z]+").matcher(str).matches();
				return isMatched;
			}
}
