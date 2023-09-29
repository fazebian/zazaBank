package xyz.sahia.zazaBank;

public class Compte {

    private int balance = 0;
    int balance(){
        return balance;
    }
    public void depot(int montant){
        balance+= montant;
    }
}
