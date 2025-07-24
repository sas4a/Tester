package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DigitSumCalculatorTest {

    @Test
    void sumDigits_singleDigit(){
        Assertions.assertEquals(5,DigitSumCalculator.sumDigits(5));
    }

    @Test
    void sumDigits_multiDigit(){
        Assertions.assertEquals(22,DigitSumCalculator.sumDigits(2479));
    }

    @Test
    void sumDigits_negativDigits(){
        Assertions.assertEquals(35,DigitSumCalculator.sumDigits(-952856));
    }

    @Test
    void sumDigits_zero(){
        Assertions.assertEquals(0,DigitSumCalculator.sumDigits(0));
    }



}
