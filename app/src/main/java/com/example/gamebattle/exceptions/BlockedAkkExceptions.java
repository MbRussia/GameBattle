package com.example.gamebattle.exceptions;

public class BlockedAkkExceptions extends Exception {
    private String error = "Аккаунт заблокирован";

    @Override
    public String getMessage() {
        return error;
    }

    @Override
    public String getLocalizedMessage() {
        return error;
    }
}
