package com.example.gamebattle.typeWarriors;

public class Viking implements Warrior {
    private int healts = 100;
    private int attack = 50;
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

}
