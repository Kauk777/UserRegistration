package com.bridgelabz.useregistartion;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final Pattern FIRST_NAME=Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
	
	public boolean firstNameValidation(String fname) {
		return FIRST_NAME.matcher(fname).matches();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UserRegistration user=new UserRegistration();
		System.out.println("Enter user first name: ");
		String fname=sc.next();
		System.out.println("First Name validation: "+user.firstNameValidation(fname));
		
	}

}
