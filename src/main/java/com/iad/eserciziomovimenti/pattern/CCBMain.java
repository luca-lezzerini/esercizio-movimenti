package com.iad.eserciziomovimenti.pattern;

public class CCBMain {

    public static void main(String[] args) {
        FactoryDivise.divisaCorrente = "LIT";
        CCB clire = new CCB();
        Divisa d1 = FactoryDivise.createDivisa();
        Divisa d2 = FactoryDivise.createDivisa();
        FactoryDivise.divisaCorrente = "EUR";
        Divisa d3 = FactoryDivise.createDivisa();
    }
    
}
