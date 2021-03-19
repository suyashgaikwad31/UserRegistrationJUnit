package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String EMAIL_PATTERN= "[0-9 a-z A-z]+([._+-][0-9 a-z A-Z]+)*"+"@([0-9 a-z A-Z][-]?)+[.][a-z A-Z]{2,4}([.][a-z A-Z]{2,4})?$";

    public static boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }
    public static boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}
