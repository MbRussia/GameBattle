package com.example.gamebattle.atm;

public class Card  {
    private String clientName;
    private int cash;
    private int numberCard;
    private int pin;

    public Card(int numberCard, String clientName) {
        this.numberCard = numberCard;
        this.clientName = clientName;
    }

    public Card(int cash, int numberCard, int pin, String clientName) {
        this.cash = cash;
        this.numberCard = numberCard;
        this.pin = pin;
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }

    public int getCash() {
        return cash;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}