package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String EMAIL_PATTERN = "[0-9 a-z A-z]+([._+-][0-9 a-z A-Z]+)*"+"@([0-9 a-z A-Z][-]?)+[.][a-z A-Z]{2,4}([.][a-z A-Z]{2,4})?$";
    private static final String MOB_NUMBER = "^[1-9]{2}\\s{0,1}[0-9]{5}[0-9]{5}$";
    private static final String PASSWORDRULE1 = "[a-z]{8}";
    private static final String PASSWORDRULE2 =  "[a-z A-Z]{8}";
    private static final String PASSWORDRULE3 = "[0-9 a-z A-Z]{8}";

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

    public static boolean validateMobNumber(String mobnumber) {
        Pattern pattern = Pattern.compile(MOB_NUMBER);
        return pattern.matcher(mobnumber).matches();
    }

    public static boolean validatePasswordRule1(String password1) {
        Pattern pattern = Pattern.compile(PASSWORDRULE1);
        return pattern.matcher(password1).matches();
    }

    public static boolean validatePasswordrule2(String password2) {
        Pattern pattern = Pattern.compile(PASSWORDRULE2);
        return pattern.matcher(password2).matches();
    }

    public static boolean validatePasswordRule3(String password3) {
        Pattern pattern = Pattern.compile(PASSWORDRULE3);
        return pattern.matcher(password3).matches();
    }
}
