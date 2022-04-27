package com.iad.eserciziomovimenti;

import java.time.LocalDate;

public class AddebitoRid extends UscitaCC {

    public AddebitoRid(LocalDate data, double importo) {
        super(data, importo, 1.5);
    }

}
