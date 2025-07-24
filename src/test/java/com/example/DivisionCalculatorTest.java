package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionCalculatorTest {

    DivisionCalculator divisionCalculator = new DivisionCalculator();

    @Test
    void divide_byZero (){
        Assertions.assertThrows(ArithmeticException.class,()->divisionCalculator.divide(5,0));
        System.out.println("Ошибка: на '0' делить нельзя");
    }

    @Test
    void divide_returnDouble() {
        Assertions.assertEquals(1, divisionCalculator.divide(4, 3));
    }
}
