package com.example.gamebattle.exceptions;

public class DuplicateUserExceptions extends Exception {
    private String error = "Такой акк или карта уже существует";

    @Override
    public String getMessage() {
        return error;
    }

    @Override
    public String getLocalizedMessage() {
        return error;
    }
}
