package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validateFirstName("Suyash");
        Assertions.assertEquals(true, result);

    }
    @Test
     public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validateFirstName("Su");
        Assertions.assertEquals(false,result);
    }
    @Test
     public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validateLastName("Gaikwad");
        Assertions.assertEquals(true,result);
    }
    @Test
     public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validateLastName("Ga");
        Assertions.assertEquals(false,result);
    }
    @Test
     public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validateEmail("abc.xyz@bl.co.in");
        Assertions.assertEquals(true,result);
    }
    @Test
     public void givenMobNumber_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validateMobNumber("91 9689887638");
        Assertions.assertEquals(true,result);
    }
    @Test
     public void givenMobNumber_WhenDifferent_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validateMobNumber("91 968988B638");
        Assertions.assertEquals(false,result);

    }
    @Test
     public void givenPasswordRule1_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validatePasswordRule1("jdhuihjn");
        Assertions.assertEquals(true,result);
    }
    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validatePasswordrule2("jdFuiOjn");
        Assertions.assertEquals(true,result);
    }
    @Test
     public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validatePasswordRule3("jdF5iOj8");
        Assertions.assertEquals(true,result);
    }
    @Test
     public void givenPasswordRule4_WhenProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = UserValidator.validatePasswordRule4("Eyu6@uyh");
        Assertions.assertEquals(false,result);

    }

    @Test
     public void givenFirstName_WhenProper_ShouldReturnHappy() {
        UserValidator validator = new UserValidator();
        String result = UserValidator.validatefirstname("Suyash");
        Assertions.assertEquals("Happy", result);
    }

     @Test
     public void givenFirstName_WhenShort_ShouldReturnSad() {
         UserValidator validator = new UserValidator();
         String result = UserValidator.validatefirstname("Su");
         Assertions.assertEquals("Sad", result);
     }

     @Test
     public void givenLastName_WhenProper_ShouldReturnHappy() {
         UserValidator validator = new UserValidator();
         String result = UserValidator.validatelastname("Gaikwad");
         Assertions.assertEquals("Happy", result);
     }

     @Test
     public void givenLastName_WhenShort_ShouldReturnSad() {
         UserValidator validator = new UserValidator();
         String result = UserValidator.validatelastname("Ga");
         Assertions.assertEquals("Sad", result);
     }

     @Test
     public void givenEmail_WhenProper_ShouldReturnHappy() {
         UserValidator validator = new UserValidator();
         String result = UserValidator.validateemail("abc.xyz@bl.co.in");
         Assertions.assertEquals("Happy", result);
     }

     @Test
     public void givenEmail_WhenProper_ShouldReturnSad() {
         UserValidator validator = new UserValidator();
         String result = UserValidator.validateemail("abc.xyz@bl.co.in");
         Assertions.assertEquals("Happy", result);
     }

     @Test
     public void givenMobNumber_WhenNotProper_ShouldReturnSad() {
         UserValidator validator = new UserValidator();
         String result = UserValidator.validatelMobNumber("9689887638");
         Assertions.assertEquals("Sad", result);
     }

     @Test
     public void givenPassword_WhenProper_ShouldReturnHappy() {
         UserValidator validator = new UserValidator();
         String result = UserValidator.validatPassword("A6rtr59k");
         Assertions.assertEquals("Happy", result);
     }

     @Test
     public void givenPassword_WhenNotProper_ShouldReturnSad() {
         UserValidator validator = new UserValidator();
         String result = UserValidator.validatPassword("A6@tr59k");
         Assertions.assertEquals("Sad", result);
     }

}

