package com.example.gamebattle.typeWarriors;

public interface Warrior {
    int attack();
    void takeDamage(int damage);
    boolean isAlive();
    void setSquadName(String name);
}
