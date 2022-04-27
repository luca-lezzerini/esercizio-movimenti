package com.iad.eserciziomovimenti;

public class UscitaCC extends MovCC {

    public UscitaCC(double importo) {
        super(importo);
    }

    @Override
    public double getImporto() {
        return -super.getImporto();
    }
}
