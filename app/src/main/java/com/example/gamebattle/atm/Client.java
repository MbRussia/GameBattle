package com.example.gamebattle.atm;

import java.util.ArrayList;

public class Client {
    private int age;
    private String name;
    private ArrayList<Card> cards;

    public Client(int age, String name, ArrayList<Card> cards) {
        this.age = age;
        this.name = name;
        this.cards = cards;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

}
