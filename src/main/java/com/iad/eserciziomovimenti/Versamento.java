package com.iad.eserciziomovimenti;

import java.time.LocalDate;

public class Versamento extends MovCC{

    public Versamento(LocalDate data, double importo) {
        // chiamo quello con un solo parametro perchè le spese sono a zero
        super(data, importo);
    }

}
