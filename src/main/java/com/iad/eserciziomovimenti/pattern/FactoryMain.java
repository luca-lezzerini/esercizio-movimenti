package com.iad.eserciziomovimenti.pattern;

import com.iad.eserciziomovimenti.MovCC;
import java.time.LocalDate;

public class FactoryMain {

    public static void main(String[] args) {
        MovCC mb = FactoryMovimenti.createMovimento("B", 0);
        MovCC mv = FactoryMovimenti.createMovimento("V", 0);
    }
}
