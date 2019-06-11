package com.example.gamebattle.atm;

import java.util.ArrayList;

public class TerminalImpl implements Terminal {
    private ArrayList<Client> clients = new ArrayList<>();
    @Override
    public int getCash(int numberCard) {

        return 0;
    }

    @Override
    public void transaction(int transaction, int numberCard) {

    }

    @Override
    public void clientInsert(Client client) {

    }

    @Override
    public void cardInsert(Card card) {

    }
}
