package com.example;

public class WordCounter {

    public static int countWords(String text) {
        if (text.isBlank() || text == null) throw new NullPointerException("Строка пуста");
        String[] array = text.trim().split("\\s+");
        return array.length;
    }
}
