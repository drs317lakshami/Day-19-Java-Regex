package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRunner {

	static boolean validate(String regex, String input) {

		return Pattern.compile(regex).matcher(input).matches();

	}

	public static void main(String[] args) {

		String emailPattern = "[a-zA-Z]+([_+-.][a-zA-Z])*[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2})*$";

		String input = "abc@bl.co";

		 System.out.println(validate(emailPattern, input));

	}

}