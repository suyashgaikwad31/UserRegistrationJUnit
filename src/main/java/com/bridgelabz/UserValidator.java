package com.bridgelabz;


import java.util.ArrayList;
import java.util.regex.Pattern;
@FunctionalInterface
interface IUserValidator {
    String compare(String regex, String input);

}

public class UserValidator {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String EMAIL_PATTERN = "[0-9 a-z A-z]+([._+-][0-9 a-z A-Z]+)*"+"@([0-9 a-z A-Z][-]?)+[.][a-z A-Z]{2,4}([.][a-z A-Z]{2,4})?$";
    private static final String MOB_NUMBER = "^[1-9]{2}\\s{0,1}[0-9]{5}[0-9]{5}$";
    private static final String PASSWORDRULE1 = "[a-z]{8}";
    private static final String PASSWORDRULE2 =  "[a-z A-Z]{8}";
    private static final String PASSWORDRULE3 = "[0-9 a-z A-Z]{8}";
    private static final String PASSWORDRULE4 = "^(?=.?[A-Z])(?=(.[a-z]){1,})(?=[.]{1,})(?=1,})(?!.*\\s).{8,}$";


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

    public static boolean validatePasswordRule4(String password4) {
        Pattern pattern = Pattern.compile(PASSWORDRULE4);
        return pattern.matcher(password4).matches();
    }

        IUserValidator lambdaCompare =((regex ,input) -> {
            try {
                if (Pattern.matches(regex, input))
                    return "Happy";
            } catch (Exception e) {
                try {
                    throw new UserValidatorException("Invalid");
                } catch (UserValidatorException userValidatorException) {
                    userValidatorException.printStackTrace();
                }
            }
            return "Sad";
        });


            public static String validatefirstname (String fname) throws Exception {
                String firstnamepattern = "^[A-Z]{1}[a-z]{3,}$";
                try {
                    if (Pattern.matches(firstnamepattern, fname))
                        return "Happy";
                } catch (Exception e) {
                    throw new Exception("Invalid");
                }
                return "Sad";
            }


            public static String validatelastname (String lname) throws Exception {
                String lastnamepattern = "^[A-Z]{1}[a-z]{3,}$";
                try {
                    if (Pattern.matches(lastnamepattern, lname))
                        return "Happy";
                } catch (Exception e) {
                    throw new Exception("Invalid");
                }
                return "Sad";
            }

            public static String validateemail (String email) throws Exception {
                String emailnamepattern = "[0-9 a-z A-z]+([._+-][0-9 a-z A-Z]+)*" + "@([0-9 a-z A-Z][-]?)+[.][a-z A-Z]{2,4}([.][a-z A-Z]{2,4})?$";
                try {
                    if (Pattern.matches(emailnamepattern, email))
                        return "Happy";
                } catch (Exception e) {
                    throw new Exception("Invalid");
                }
                return "Sad";
            }

            public static String validatelMobNumber (String mobnum) throws Exception {
                String mobnumpattern = "^[1-9]{2}\\s{0,1}[0-9]{5}[0-9]{5}$";
                try {
                    if (Pattern.matches(mobnumpattern, mobnum))
                        return "Happy";
                } catch (Exception e) {
                    throw new Exception("Invalid");
                }
                return "Sad";


            }
            public static String validatPassword (String password) throws Exception {
                String Passwordpattern = "[0-9 a-z A-Z]{8}";
                try {
                    if (Pattern.matches(Passwordpattern, password))
                        return "Happy";
                } catch (Exception e) {
                    throw new Exception("Invalid");
                }
                return "Sad";
            }

   public static void main(String[] args) {
        ArrayList<String>emails = new ArrayList<String>();
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.com.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");
        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc123@.com.com");
        emailvalidate(emails);
    }

    private static void emailvalidate(ArrayList<String> emails) {
        String emailPattern = "[0-9 a-z A-z]+([._+-][0-9 a-z A-Z]+)*\"+\"@([0-9 a-z A-Z][-]?)+[.][a-z A-Z]{2,4}([.][a-z A-Z]{2,4})?$";
        for (String data :emails) {
            if (Pattern.matches(emailPattern, data));
                System.out.println("Valid");
        }
    }




    public boolean validateEmailAddress(String email2Test) {
        Pattern pattern = Pattern.compile(email2Test);
        return pattern.matcher(email2Test).matches();
    }
        
    
    }
