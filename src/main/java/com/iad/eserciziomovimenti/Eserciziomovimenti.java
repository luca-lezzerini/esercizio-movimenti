package com.iad.eserciziomovimenti;

import java.util.List;

public class EsercizioMovimenti {

    public static void main(String[] args) {
//        CollezioneDiEsempio coll = new CollezioneDiEsempio();
        List<MovCC> lista = CollezioneDiEsempio.getMovimenti();
        System.out.println("Dimensione lista = " + lista.size());

        double saldo = 0.0;
        for (MovCC mov : lista) {
            saldo += mov.getImporto() - mov.getSpese();
        }
        System.out.println("Il saldo è " + saldo);

        // ordinamento per importo
        ConfrontatorePerImporto cimp = new ConfrontatorePerImporto();
        lista.sort(cimp);

        System.out.println("Ordinata per importo crescente");
        for (MovCC mov : lista) {
            System.out.println("Mov = " + mov);
        }

        // ordinamento per data
        ConfrontatorePerDataAsc cdasc = new ConfrontatorePerDataAsc();
        lista.sort(cdasc);

        System.out.println("Ordinata per data crescente");
        for (MovCC mov : lista) {
            System.out.println("Mov = " + mov);
        }

        // ordinamento per data discendente
        lista.sort((m1, m2) -> {
            if (m1.getData().isBefore(m2.getData())) {
                return +1;
            } else if (m1.getData().isAfter(m2.getData())) {
                return -1;
            } else {
                return 0;
            }
        });

        System.out.println("Ordinata per data discendente");
        for (MovCC mov : lista) {
            System.out.println("Mov = " + mov);
        }

        // ordinamento per spesa ascendente
        lista.sort((m1, m2) -> {
            if (m1.getSpese() < m2.getSpese()) {
                return -1;
            } else if (m1.getSpese() > m2.getSpese()) {
                return +1;
            } else {
                return 0;
            }
        });
        System.out.println("Ordinato per spese ASC");
        for (MovCC mov : lista) {
            System.out.println(mov);
        }

        // ordinamento per spesa discendente
        lista.sort((m1, m2) -> {
            if (m1.getSpese() < m2.getSpese()) {
                return 1;
            } else if (m1.getSpese() > m2.getSpese()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println("Ordinato per spese DESC");
        for (MovCC mov : lista) {
            System.out.println(mov);
        }
    }
}
