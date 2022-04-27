package com.iad.eserciziomovimenti;

import java.time.LocalDate;

public class MovCC {

    private LocalDate data;
    private double importo;
    private double spese;

    public MovCC(LocalDate data, double importo) {
        this.data = data;
        this.importo = importo;
        spese = 0.0;
    }

    public MovCC(LocalDate data, double importo, double spese) {
        this.data = data;
        this.importo = importo;
        this.spese = spese;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public double getSpese() {
        return spese;
    }

    public void setSpese(double spese) {
        this.spese = spese;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MovCC{" + "importo=" + getImporto() + ", spese=" + spese + '}';
    }

}
