package com.example;

public class PalindromeChecker {

    public static boolean isPalindrome(String text){
        if(text == null || text.isBlank()) throw new IllegalArgumentException("Строка не может быть null");
        String unifiedRegister = text.replaceAll("\\s+","").toLowerCase();
        for (int i = 0; i < unifiedRegister.length()/2; i++) {
            if(unifiedRegister.charAt(i) != unifiedRegister.charAt(unifiedRegister.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}

