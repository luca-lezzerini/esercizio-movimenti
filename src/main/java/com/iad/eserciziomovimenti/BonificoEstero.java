package com.iad.eserciziomovimenti;

import java.time.LocalDate;

public class BonificoEstero extends UscitaCC {

    public BonificoEstero(LocalDate data, double importo) {
        super(data, importo, 16.0);
    }

}
