package com.iad.eserciziomovimenti;

import java.time.LocalDate;

public class BonificoEsteroEntrata extends MovCC {

    public BonificoEsteroEntrata(LocalDate data, double importo) {
        super(data, importo, 16.0);
    }

}
