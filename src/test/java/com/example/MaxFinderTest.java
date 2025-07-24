package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class MaxFinderTest {

    @Test
    void findMax_onlyOneElementInArray(){
        int[] array = {3};
        Assertions.assertEquals(3,MaxFinder.findMax(array));
    }

    @Test
    void findMax_arrayWithNegativeNumbers(){
        int[] array = {-4,-2,-5,-6,-17};
        Assertions.assertEquals(-2,MaxFinder.findMax(array));
    }

    @Test
    void findMax_arrayWithRepeatNumbers(){
        int[] array = {12,12,5,5,17,28,19,3};
        Assertions.assertEquals(28,MaxFinder.findMax(array));
    }

    @Test
    void findMax_arrayWithoutNumbers(){
        int[] array = {};
        Assertions.assertThrows(IllegalArgumentException.class,()->MaxFinder.findMax(array));
    }




}
