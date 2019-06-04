package com.example.gamebattle.typeWarriors;

public class Archer implements Warrior {
    private int healts = 80;
    private int attack = 80;

    @Override
    public int attack() {
        return attack;
    }

    @Override
    public void takeDamage(int damage) {
        healts-=damage;
    }

    @Override
    public boolean isAlive() {
        if (healts<=0){
            return false;
        }
        return true;
    }

    @Override
    public void setSquadName(String name) {

    }

    @Override
    public String toString() {
        return "Archer{" +
                "healts=" + healts +
                ", attack=" + attack +
                '}';
    }
}
