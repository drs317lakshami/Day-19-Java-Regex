package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRunner {

	static boolean validate(String regex, String mobileNum) {

		return Pattern.compile(regex).matcher(mobileNum).matches();

	}

	public static void main(String[] args) {

		String mobilenumberPattern ="^(91)( )[6-9]{1}[0-9]{9}$";

		String mobileNum  = "91 7588808888";

		 System.out.println(validate(mobilenumberPattern, mobileNum));

	}

}