package com.bridgelabz.useregistartion;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	private static final Pattern FIRST_NAME=Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
	private static final Pattern LAST_NAME=Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
    private static final Pattern EMAIL_PATTERN=Pattern.compile("^[0-9a-zA-Z_+-]+(\\.?[0-9a-zA-Z_+-]*)[^\\.]@[0-9a-zA-Z]+(\\.[0-9a-zA-Z]{2,})(\\.?[a-zA-Z]{2,})?$");
	private static final Pattern MOBILE_PATTERN=Pattern.compile("^[0-9]{2}\\s{1}[6-9]{1}[0-9]{9}$");
	private static final Pattern PASSWORD_PATTERN=Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&-+=]{1}).{8,}$");
	
	public boolean emailValidate(String email ) {
		return EMAIL_PATTERN.matcher(email).matches();
	}
	
	public boolean firstNameValidation(String fname) {
		return FIRST_NAME.matcher(fname).matches();
	}
	
	public boolean lastNameValidation(String lname) {
		return LAST_NAME.matcher(lname).matches();
	}
	
	public boolean mobileNoValidation(String phno) {
		return MOBILE_PATTERN.matcher(phno).matches();
	}
	
	public boolean passwordValidation(String psswd ) {
		return PASSWORD_PATTERN.matcher(psswd).matches();
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
		System.out.println("Enter user Mobile No: ");
		sc.nextLine();
		String phno=sc.nextLine();
		System.out.println("Enter user Password: ");
		String psswd=sc.next();
		
		System.out.println("First Name validation: "+user.firstNameValidation(fname));
		System.out.println("Last Name validation: "+user.lastNameValidation(lname));
		System.out.println("Email validation: "+user.emailValidate(email));
		System.out.println("PhoneNumber validation: "+user.mobileNoValidation(phno));
		System.out.println("Password validation: "+user.passwordValidation(psswd));
		
		System.out.println("*****SAMPLE EMAILS TO TEST*****");
		System.out.println("**VALID EMAILS**");
		System.out.println("Email Validation abc@yahoo.com: "+user.emailValidate("abc@yahoo.com"));
		System.out.println("Email Validation abc-100@yahoo.com: "+user.emailValidate("abc-100@yahoo.com"));
		System.out.println("Email Validation abc.100@yahoo.com: "+user.emailValidate("abc.100@yahoo.com"));
		System.out.println("Email Validation abc111@yabc.com: "+user.emailValidate("abc111@abc.com"));
		System.out.println("Email Validation abc-100@abc.net: "+user.emailValidate("abc-100@abc.net"));
		System.out.println("Email Validation abc.100@abc.com.au: "+user.emailValidate("abc.100@abc.com.au"));
		System.out.println("Email Validation abc@1.com: "+user.emailValidate("abc@1.com"));
		System.out.println("Email Validation abc@gmail.com.com: "+user.emailValidate("abc@gmail.com.com"));
		System.out.println("Email Validation abc+100@gmail.com: "+user.emailValidate("abc+100@gmail.com"));
		System.out.println("**INVALID EMAILS**");
		System.out.println("Email Validation abc: "+user.emailValidate("abc"));
		System.out.println("Email Validation abc@.com.my: "+user.emailValidate("abc@.com.my"));
		System.out.println("Email Validation abc123@gmail.a: "+user.emailValidate("abc123@gmail.a"));
		System.out.println("Email Validation abc123@.com: "+user.emailValidate("abc123@.com"));
		System.out.println("Email Validation abc123@.com.com: "+user.emailValidate("abc123@.com.com"));
		System.out.println("Email Validation .abc@abc.com: "+user.emailValidate(".abc@abc.com"));
		System.out.println("Email Validation abc()*@gmail.com: "+user.emailValidate("abc()*@gmail.com"));
		System.out.println("Email Validation abc@%*.com: "+user.emailValidate("abc@%*.com"));
		System.out.println("Email Validation abc..2002@gmail.com: "+user.emailValidate("abc..2002@gmail.com"));
		System.out.println("Email Validation abc.@gmail.com: "+user.emailValidate("abc.@gmail.com"));
		System.out.println("Email Validation abc@abc@gmail.com: "+user.emailValidate("abc@abc@gmail.com"));
		System.out.println("Email Validation abc@gmail.com.1a: "+user.emailValidate("abc@gmail.com.1a"));
		System.out.println("Email Validation abc@gmail.com.aa.au: "+user.emailValidate("abc@gmail.com.aa.au"));
	}

}
