package com.example;

public class MaxFinder {

    public static int findMax(int[] numbers){
        if(numbers == null || numbers.length ==0){
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        int maxDigit = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > maxDigit) maxDigit = numbers[i];
        }
        return maxDigit;
    }
}
