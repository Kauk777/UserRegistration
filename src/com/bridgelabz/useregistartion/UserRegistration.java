package com.bridgelabz.useregistartion;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final Pattern FIRST_NAME=Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
	private static final Pattern LAST_NAME=Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
    private static final Pattern EMAIL_PATTERN=Pattern.compile("^[0-9a-zA-Z_+-]+(\\.?[0-9a-zA-Z_+-]*)[^\\.]@[0-9a-zA-Z]+(\\.[0-9a-zA-Z]{2,})(\\.?[a-zA-Z]{2,})?$");
	
	public boolean emailValidation(String email ) {
		return EMAIL_PATTERN.matcher(email).matches();
	}
	
	public boolean firstNameValidation(String fname) {
		return FIRST_NAME.matcher(fname).matches();
	}
	
	public boolean lastNameValidation(String lname) {
		return LAST_NAME.matcher(lname).matches();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UserRegistration user=new UserRegistration();
		System.out.println("Enter user first name: ");
		String fname=sc.next();
		System.out.println("Enter user last name: ");
		String lname=sc.next();
		System.out.println("Enter user email id: ");
		String email=sc.next();
		System.out.println("First Name validation: "+user.firstNameValidation(fname));
		System.out.println("Last Name validation: "+user.lastNameValidation(lname));
		System.out.println("Email validation: "+user.emailValidation(email));
		
	}

}
