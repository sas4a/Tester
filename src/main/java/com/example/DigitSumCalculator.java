package com.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DigitSumCalculator {

    public static int sumDigits(int number){
        int sum = 0;
        String digitString = Integer.toString(Math.abs(number));
        for (char x : digitString.toCharArray()){
          sum+= Character.getNumericValue(x);
        }
        return sum;
    }
}
