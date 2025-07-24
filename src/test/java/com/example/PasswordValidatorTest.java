package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    void isValid_notEnoughLenght(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> PasswordValidator.isValid("Hello"));
    }

    @Test
    void isValid_passwordIsNull(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> PasswordValidator.isValid(null));
    }

    @Test
    void isValid_withOutDigit(){
        Assertions.assertFalse(PasswordValidator.isValid("HelloWorld"));
    }

    @Test
    void isValid_correctPassword(){
        Assertions.assertTrue(PasswordValidator.isValid("HelloWorld2025"));
    }




}
