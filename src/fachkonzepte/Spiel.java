package fachkonzepte;

import fachkonzepte.figuren.*;

public final class Spiel {
    private final Wuerfel[] wuerfel;

    private final Figur[] figuren;

    public Spiel() {
        wuerfel = new Wuerfel[5];
        for (int i = 0; i < wuerfel.length; i++) {
            wuerfel[i] = new Wuerfel();
        }
        figuren = new Figur[13];
        figuren[0] = new Einser();
        figuren[1] = new Zweier();
        figuren[2] = new Dreier();
        figuren[3] = new Vierer();
        figuren[4] = new Fuenfer();
        figuren[5] = new Sechser();
        figuren[6] = new Dreierpasch();
        figuren[7] = new Viererpasch();
        figuren[8] = new FullHouse();
        figuren[9] = new KleineStrasse();
        figuren[10] = new GrosseStrasse();
        figuren[11] = new Kniffel();
        figuren[12] = new Chance();
    }

    public int ermittleBonus() {

    }

    public int ermittleEndsumme() {

    }

    public int ermittlePunktzahlOben() {

    }

    public int ermittlePunktzahlObenMitBonus() {

    }

    public int ermittlePunktzahlUnten() {

    }

    public boolean istBeendet() {

    }

    public void starteNeu() {

    }

    public void trageEin(int figurenNummer, int[] augenzahlen) {

    }
}
