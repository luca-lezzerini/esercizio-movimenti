package com.iad.eserciziomovimenti;

import java.time.LocalDate;

public class UscitaCC extends MovCC {

    public UscitaCC(LocalDate data, double importo) {
        super(data, importo);
    }

    public UscitaCC(LocalDate data, double importo, double spese) {
        super(data, importo, spese);
    }

    @Override
    public double getImporto() {
        return -super.getImporto();
    }
}
