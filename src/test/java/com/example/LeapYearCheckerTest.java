package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearCheckerTest {

    @Test
    void isLeapYear_divisibleBy4() {
        assertTrue(LeapYearChecker.isLeapYear(2024));
    }

    @Test
    void isLeapYear_divisibleBy100Not400() {
        assertFalse(LeapYearChecker.isLeapYear(1900));
    }

    @Test
    void isLeapYear_divisibleBy400() {
        assertTrue(LeapYearChecker.isLeapYear(2000));
    }

    @Test
    void isLeapYear_notLeapYear() {
        assertFalse(LeapYearChecker.isLeapYear(2023));
    }

}
