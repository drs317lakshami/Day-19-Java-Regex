package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRunner {

	static boolean validate(String regex, String input) {

		return Pattern.compile(regex).matcher(input).matches();

	}

	public static void main(String[] args) {

		String firstNamePattern = "^[A-Z][a-zA-Z]{3,}$";

		String input = "Devraj";

		 System.out.println(validate(firstNamePattern, input));

	}

}