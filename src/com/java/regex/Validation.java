package com.java.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
    Scanner sc = new Scanner(System.in);

    public void checkFirstName() {
        System.out.println("Enter First Name : ");
        String firstName = sc.next();
        if (Pattern.matches("^[A-Z]{1}[a-z]{3,}", firstName)) {
            System.out.println("First Name is Valid");
        } else {
            System.out.println("First Name is Invalid");
        }
    }

    public void checkLastName() {
        System.out.println("--------Check Last Name-------");
        System.out.println("Enter Last Name : ");
        String lastName = sc.next();
        if (Pattern.matches("^[A-Z]{1}[a-z]{3,}", lastName)) {
            System.out.println("LastName is Valid");
        } else {
            System.out.println("LastName is Invalid");
        }
    }

    public void checkEmail() {
        System.out.println("------Check Email------");
        System.out.println("Enter Email : ");
        String email = sc.next();
        if (Pattern.matches("^[a-zA-Z]{3,}[.]?[A-za-z0-9]{3,}[.]?[a-zA-Z]+[@]{1}[a-z]+[.]?[a-z]*", email)) {
            System.out.println("Email is Valid");
        } else {
            System.out.println("Email is Invalid");
        }
    }

    public void checkPhoneNumber() {
        System.out.println("---------Check PhoneNumber-------");
        System.out.println("Enter PhoneNumber : ");
        String phoneNumber = sc.nextLine();
        if (Pattern.matches("^[0-9]+\s[0-9]{10}", phoneNumber)) {
            System.out.println("PhoneNumber is Valid");
        } else {
            System.out.println("PhoneNumber is Invalid");
            checkPhoneNumber();
        }
    }

    public void checkPasswordRule1() {
        System.out.println("------Password Rule1------");
        System.out.println("Enter Password : ");
        String password = sc.nextLine();
        if (Pattern.matches("^[a-zA-z]{8,}", password)) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
            checkPasswordRule1();
        }
    }

    public void checkPasswordRule2() {
        System.out.println("--------Password Rule2-------");
        System.out.println("Enter Password : ");
        String password = sc.nextLine();
        if (Pattern.matches("^[A-z]+[A-Za-z]{8,}", password)) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
            checkPasswordRule1();
        }
    }

    public void checkPasswordRule3() {
        System.out.println("--------Password Rule3------");
        System.out.println("Enter Password : ");
        String password = sc.nextLine();
        if (Pattern.matches("^[A-Z0-9]+[A-Za-z0-9]{8,}", password)) {
            System.out.println("Password is Valid---!!");
        } else {
            System.out.println("Password is Invalid--!!");
            checkPasswordRule1();
        }
    }
    public void checkPasswordRule4() {
        System.out.println("-------Password Rule4------");
        System.out.println("Enter Password : ");
        String password  = sc.nextLine();
        if (Pattern.matches("^[A-Z]+[A-Za-z0-9]{7,}[!@#$%^&*()=]+",password)) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
            checkPasswordRule4();
        }
    }
    public void checkEmail2() {
        System.out.println("--------Email Check2-------");
        System.out.println("Enter Email : ");
        String email = sc.nextLine();
        if (Pattern.matches("^[a-zA-Z]{3,}[+-.]?[A-za-z0-9]*[@]{1}[a-z]+[.]?[a-z]*[.]?[a-z]", email)) {
            System.out.println("Email is Valid");
        } else {
            System.out.println("Email is Invalid");
            checkEmail2();
        }
    }

}