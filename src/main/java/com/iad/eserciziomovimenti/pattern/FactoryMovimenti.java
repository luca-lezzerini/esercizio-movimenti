package com.iad.eserciziomovimenti.pattern;

import com.iad.eserciziomovimenti.Bonifico;
import com.iad.eserciziomovimenti.BonificoEstero;
import com.iad.eserciziomovimenti.MovCC;
import com.iad.eserciziomovimenti.Versamento;
import java.time.LocalDate;

public class FactoryMovimenti {

    public static MovCC createMovimento(String tipo, double importo) {
        if (tipo.equals("V")) {
            return new Versamento(LocalDate.now(), importo);
        } else if (tipo.equals("B")) {
            return new BonificoEstero(LocalDate.now(), importo);
        } else {
            return new MovCC(LocalDate.now(), importo);
        }
    }
}
