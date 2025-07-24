package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void sum(){
        int sum = calculator.sum(5,3);
        Assertions.assertEquals(8,sum);
    }

    @Test
    void evenOrAdd_evenNumber(){
        boolean isEven = calculator.evenOrOdd(10);
        Assertions.assertTrue(isEven);
    }

    @Test
    void evenOrOdd_oddNumber(){
        boolean isOdd = calculator.evenOrOdd(15);
        Assertions.assertFalse(isOdd);
    }

    @Test
    void divide_byZero(){
        Assertions.assertThrows(ArithmeticException.class, ()-> calculator.divide(5,0));

    }


}
