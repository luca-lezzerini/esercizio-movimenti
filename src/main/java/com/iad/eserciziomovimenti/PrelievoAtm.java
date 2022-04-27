package com.iad.eserciziomovimenti;

import java.time.LocalDate;

public class PrelievoAtm extends UscitaCC {

    public PrelievoAtm(LocalDate data, double importo) {
        super(data, importo, 1.5);
    }

}
