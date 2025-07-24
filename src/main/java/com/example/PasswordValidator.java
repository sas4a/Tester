package com.example;

public class PasswordValidator {

    public static boolean isValid(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Пароль не может быть null");
        }
        if (password.length() < 8) {
            throw new IllegalArgumentException("Длина пароль меньше минимального значения");
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
