package com.example.gamebattle.atm;

public interface Terminal {
    int getCash(int numberCard);
    void transaction(int transaction, int numberCard);
    void clientInsert(Client client);
    void cardInsert(Card card);

}
