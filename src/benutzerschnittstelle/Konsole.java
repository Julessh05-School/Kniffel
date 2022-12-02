package benutzerschnittstelle;

import fachkonzepte.Wuerfel;

public final class Konsole {
    public static void main(String[] args) {
        final Wuerfel[] w = new Wuerfel[5];
        for (int i = 0; i < 5; i++) {
            w[i] = new Wuerfel();
        }

        for (Wuerfel lW : w) {
            lW.wirf();
            Wuerfel.geworfen();
        }
        System.out.println(Wuerfel.darfNochmalWuerfelnAktFigur());
        w[1].wirf();
        System.out.println(Wuerfel.darfNochmalWuerfelnAktFigur());
        w[3].wirf();
        Wuerfel.starteNeueFigur();
        w[4].wirf();
        System.out.println(Wuerfel.darfNochmalWuerfelnAktFigur());
    }
}
