package com.iad.eserciziomovimenti;

public class Versamento extends MovCC{

    public Versamento(double importo) {
        // chiamo quello con un solo parametro perchè le spese sono a zero
        super(importo);
    }

}
