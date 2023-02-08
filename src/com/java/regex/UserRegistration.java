package com.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Regular Expression program to validate User Registration!!!");
		UserRegistration userEntry = new UserRegistration();

		userEntry.validateEntries();
	}

	public void validateEntries() {
		System.out.println("Enter First Name :");
		validateName(getUserInput());

		System.out.println("Enter Last Name :");
		validateName(getUserInput());

		System.out.println("\nEnter Email Id : ");
		validateEmail(getUserInput());

		System.out.println("\nEnter Mobile Number : ");
		validateMobileNumber(getUserInput());
		
		System.out.println("\nEnter Password : ");
		validatePassword(getUserInput());

	}

	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	private void validatePassword(String input) {
		String password = "^(?=.*[A-Z])(?=.*[0-9])[0-9a-zA-Z]{8,}$";
		
		System.out.println("\nValidating Password...");
		match(password, input);
	}

	public void validateMobileNumber(String input) {

		String mobile = "^(91)( )[6-9]{1}[0-9]{9}$";

		System.out.println("\nValidating Mobile Number...");
		match(mobile, input);
	}

	public void validateEmail(String input) {

		String email = "^[0-9a-zA-Z]+([_+-.a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?$";

		System.out.println("\nValidating Email...");
		match(email, input);
	}

	public void validateName(String input) {

		String name = "^[A-Z][a-zA-Z]{3,}$";

		Pattern pattern = Pattern.compile(name);
		Matcher match = pattern.matcher(input);

		System.out.println("Validating Name...");
		printResult(match.matches(), input);

	}

	public void match(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(input);

		printResult(match.matches(), input);
	}

	public void printResult(boolean isOk, String input) {
		if (isOk)
			System.out.println(" " + input + " is Valid");
		else
			System.out.println(" " + input + " is Invalid");
	}

}