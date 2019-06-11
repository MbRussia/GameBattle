package com.example.gamebattle.exceptions;

public class IncorrectPinExceptions extends Exception{
    private String error = "Нерпавильный пин";

    @Override
    public String getMessage() {
        return error;
    }

    @Override
    public String getLocalizedMessage() {
        return error;
    }
}
