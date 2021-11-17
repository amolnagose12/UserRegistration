package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void uc1() {
		String firstName = "Amo";
		String pattern = "^[A-Z]{1}[a-z]{2}";
		
		Pattern r = Pattern.compile(pattern);
		 Matcher m = r.matcher(firstName);
		 
		 if (m.matches()) {
			 System.out.println("Pattern matched");
		 }
		 else {
			 System.out.println("pattern not matched");
		 }
	}

	public static void main(String[] args) {
		 System.out.println("Verifying FirstName matched or not");
		 uc1();
		
	}

}
