package xyz.sahia.zazaBank;

import java.util.Collections;
import java.util.Set;

public class Compte {
    private int balance = 0;
    int balance(){
        return balance;
    }
    public void depot(int montant){
        balance+= montant;
    }

    public Set<Transaction> transactions(){
        return Collections.EMPTY_SET;
    }

}
