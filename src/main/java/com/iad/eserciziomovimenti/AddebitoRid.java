package com.iad.eserciziomovimenti;

public class AddebitoRid extends UscitaCC {

    public AddebitoRid(double importo) {
        super(importo, 1.5);
    }

    @Override
    public double getImporto() {
        return -super.getImporto();
    }
}
