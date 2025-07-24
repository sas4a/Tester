package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCounterTest {

    @Test
    void countWords_normalString(){
        Assertions.assertEquals(7,WordCounter.countWords("Каждый озотник желает знать где сидит фазан"));
        Assertions.assertEquals(3,WordCounter.countWords("Как твои дела"));
    }

    @Test
    void countWords_stringIsEmpty(){
        Assertions.assertThrows(NullPointerException.class,()-> WordCounter.countWords(""));
    }

    @Test
    void countWords_severalSpacesInRow(){
        Assertions.assertEquals(4,WordCounter.countWords("За     окном  хорошая     погода  "));
    }

    @Test
    void countWords_stringWithTabsAndLines(){
        Assertions.assertEquals(3,WordCounter.countWords("Как\tтвои\nдела"));
    }


}
