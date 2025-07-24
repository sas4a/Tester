package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {

    @Test
    void isPalindrome_palindrome(){
        Assertions.assertTrue(PalindromeChecker.isPalindrome("madam"));
    }

    @Test
    void isPalindrome_differentRegister(){
        Assertions.assertTrue(PalindromeChecker.isPalindrome("MadAm"));
    }

    @Test
    void isPalindrome_spacesInString(){
        Assertions.assertTrue(PalindromeChecker.isPalindrome("  Ma d Am "));
    }

    @Test
    void isPalindrome_emptyString(){
        Assertions.assertThrows(IllegalArgumentException.class,()->PalindromeChecker.isPalindrome(""));
    }


}
