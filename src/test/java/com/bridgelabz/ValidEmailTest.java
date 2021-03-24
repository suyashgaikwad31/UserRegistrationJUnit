package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailTest {
    private String email2Test;
    private boolean expectedResult;
    private UserValidator UserValidator;

    public ValidEmailTest(String email, boolean expectedResult) {
        this.email2Test = email;
        this.expectedResult = expectedResult;
    }
    @BeforeEach
    public void initialize() {
        UserValidator = new UserValidator();
    }
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[] [] {  {"abc@yahoo.com",true},
                                                {"abc-100@yahoo.com",true},
                                                {"abc.100@yahoo.com",true},
                                                {"abc111@abc.com",true},
                                                {"abc-100@abc.com.net",true},
                                                {"abc.100@abc.com.au",true},
                                                {"abc@1.com",true},
                                                {"abc@gmail.com.com",true},
                                                {"abc+100@gmail.com",false},
                                                {"abc",true},
                                                {"abc@.com.my",true},
                                                {"abc123@gmail.a",true},
                                                {"abc123@.com",true},
                                                {"abc123@.com.com",true},
                                                {".abc@abc.com",true},
                                                {"abc()*@gmail.com",false},
                                                {"abc@%*.com",false},
                                                {"abc..2002@gmail.com",true},
                                                {"abc.@gmail.com",true},
                                                {"abc@abc@gmail.com",true},
                                                {"abc@gmail.com.1a",true},
                                                {"abc@gmail.com.aa.au",true} });
    }

    @Test
    public void givenEmailAsVar_ShouldReturnAsPerParameterizedResult() {
       UserValidator validator = new UserValidator();
       boolean result = validator.validateEmailAddress(email2Test);
        Assertions.assertEquals(this.expectedResult, result);
    }
    

}
