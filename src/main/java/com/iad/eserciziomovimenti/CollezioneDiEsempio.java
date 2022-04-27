package com.iad.eserciziomovimenti;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class CollezioneDiEsempio {

    private static final List<MovCC> mov = new ArrayList<>();

    static {
        mov.add(new Versamento(
                LocalDate.of(2022, Month.JANUARY, 01),
                1_500
        ));
        mov.add(new Versamento(LocalDate.of(2022, Month.JANUARY, 06),2_500));
        mov.add(new PrelievoSportello(LocalDate.of(2022, Month.JANUARY, 10),800));
        mov.add(new PrelievoAtm(LocalDate.of(2022, Month.JANUARY, 15),250));
        mov.add(new Bonifico(LocalDate.of(2022, Month.JANUARY, 22),1_250));
        mov.add(new BonificoEstero(LocalDate.of(2022, Month.FEBRUARY, 4),1_600));
        mov.add(new BlocchettoAssegni(LocalDate.of(2022, Month.FEBRUARY, 14)));
        mov.add(new AddebitoRid(LocalDate.of(2022, Month.FEBRUARY, 24),450));
        mov.add(new F24(LocalDate.of(2022, Month.FEBRUARY, 28),360));
        mov.add(new Stipendio(LocalDate.of(2022, Month.MARCH, 4),2_360));
        mov.add(new BonificoEntrata(LocalDate.of(2022, Month.MARCH, 4),3_200));
        mov.add(new BonificoEsteroEntrata(LocalDate.of(2022, Month.APRIL, 12),5_000));
    }

    public static List<MovCC> getMovimenti() {
        return mov;
    }

}
