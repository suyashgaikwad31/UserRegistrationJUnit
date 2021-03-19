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
}

