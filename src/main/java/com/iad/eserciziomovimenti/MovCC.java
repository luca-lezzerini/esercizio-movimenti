package com.iad.eserciziomovimenti;

public class MovCC {

    private double importo;
    private double spese;

    public MovCC(double importo) {
        this.importo = importo;
        spese = 0.0;
    }

    public MovCC(double importo, double spese) {
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

    @Override
    public String toString() {
        return "MovCC{" + "importo=" + importo + ", spese=" + spese + '}';
    }

}
