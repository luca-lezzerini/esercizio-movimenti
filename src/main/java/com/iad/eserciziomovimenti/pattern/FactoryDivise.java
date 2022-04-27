package com.iad.eserciziomovimenti.pattern;

public class FactoryDivise {

    public static String divisaCorrente = "EUR";

    public static Divisa createDivisa() {
//        if (divisaCorrente.equals("EUR")) {
//            return new Euro();
//        } else if (divisaCorrente.equals("LIT")) {
//            return new Lire();
//        } else if (divisaCorrente.equals("PDF")) {
//            return new PizzaDiFango();
//        } else {
//            System.out.println("Errore!!!");
//            return null;
//        }

//        switch (divisaCorrente) {
//            case "EUR":
//                return new Euro();
//            case "LIT":
//                return new Lire();
//            case "PDF":
//                return new PizzaDiFango();
//            default:
//                System.out.println("Errore!!!");
//                return null;
//        }

        return switch (divisaCorrente) {
            case "EUR" -> new Euro();
            case "LIT" -> new Lire();
            case "PDF" -> new PizzaDiFango();
            default -> null;
        };
    }
}
