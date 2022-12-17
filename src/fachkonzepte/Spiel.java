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
        return 25;
    }

    public int ermittleEndsumme() {
        int result = 0;
        for (Figur f : figuren) {
            result += f.liesPunktzahl();
        }
        return result;
    }

    public int ermittlePunktzahlOben() {
        int result = 0;
        for (int i = 0; i < 6; i++) {
            result += figuren[i].liesPunktzahl();
        }
        return result;
    }

    public int ermittlePunktzahlObenMitBonus() {
        return ermittlePunktzahlOben() + ermittleBonus();
    }

    public int ermittlePunktzahlUnten() {
        int result = 0;
        for (int i = 6; i < figuren.length; i++) {
            result += figuren[i].liesPunktzahl();
        }
        return result;
    }

    public boolean istBeendet() {
        for (Figur f : figuren) {
            if (!f.istEingetragen()) {
                return false;
            }
        }
        return true;
    }

    public void starteNeu() {

    }

    public void trageEin(int figurenNummer, int[] augenzahlen) {
    }
}
