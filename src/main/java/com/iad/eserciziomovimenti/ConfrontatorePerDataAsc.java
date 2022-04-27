package com.iad.eserciziomovimenti;

import java.util.Comparator;

public class ConfrontatorePerDataAsc implements Comparator<MovCC> {

    @Override
    public int compare(MovCC m1, MovCC m2) {
        if (m1.getData().isBefore(m2.getData())) {
            return -1;
        } else if (m1.getData().isAfter(m2.getData())) {
            return 1;
        } else {
            return 0;
        }
    }

}
