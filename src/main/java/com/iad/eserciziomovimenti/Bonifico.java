package com.iad.eserciziomovimenti;

import java.time.LocalDate;

public class Bonifico extends UscitaCC {

    public Bonifico(LocalDate data, double importo) {
        super(data, importo, 2.0);
    }

}
