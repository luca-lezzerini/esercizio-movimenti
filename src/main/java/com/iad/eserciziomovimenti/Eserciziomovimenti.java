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
        
        // ordinamento
        ConfrontatorePerImporto cimp = new ConfrontatorePerImporto();
        lista.sort(cimp);
        
        System.out.println("Ordinata per importo crescente");
        for (MovCC mov : lista) {
            System.out.println("Mov = " + mov);
        }
    }
}
