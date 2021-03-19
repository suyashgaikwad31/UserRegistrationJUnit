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
}

