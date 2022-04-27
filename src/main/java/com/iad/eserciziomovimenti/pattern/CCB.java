package com.iad.eserciziomovimenti.pattern;

public class CCB {

    Divisa saldo;

    public CCB() {
        this.saldo = FactoryDivise.createDivisa();
    }
    
    
}
