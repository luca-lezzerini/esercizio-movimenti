package com.iad.eserciziomovimenti;

public class BonificoEstero extends MovCC {

    public BonificoEstero(double importo) {
        super(importo, 16.0);
    }

    @Override
    public double getImporto() {
        return -super.getImporto();
    }
}
