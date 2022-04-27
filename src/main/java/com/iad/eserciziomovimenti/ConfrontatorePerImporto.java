package com.iad.eserciziomovimenti;

import java.util.Comparator;

public class ConfrontatorePerImporto implements Comparator<MovCC> {

    @Override
    public int compare(MovCC o1, MovCC o2) {
        System.out.println("Sto confrontando " + o1 + " con " + o2);
        if (o1.getImporto() > o2.getImporto()) {
            System.out.println("1");
            return 1;
        } else if (o1.getImporto() < o2.getImporto()) {
            System.out.println("-1");
            return -1;
        } else {
            System.out.println("0");
            return 0;
        }
    }

}
