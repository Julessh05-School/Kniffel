package steuerung;

import benutzerschnittstelle.Benutzerschnittstelle;
import fachkonzepte.Bestenliste;
import fachkonzepte.Spiel;
import fachkonzepte.Wuerfel;

public final class Steuerung {
    private final Benutzerschnittstelle dieBenutzerschnittstelle;
    private final Wuerfel[] wuerfel;
    private final Spiel dasSpiel;
    private final Bestenliste dieBestenliste;

    public Steuerung(Benutzerschnittstelle benutzerschnittstelle) {
        wuerfel = new Wuerfel[5];
        for (int i = 0; i < wuerfel.length; i++) {
            wuerfel[i] = new Wuerfel();
        }
        dieBenutzerschnittstelle = benutzerschnittstelle;
        dasSpiel = new Spiel();
        dieBestenliste = new Bestenliste();
    }

    public void geklicktEintragen(int figurenNummer) {
        final int[] wA = new int[5];
        for (int i = 0; i <= 5; i++) {
            wA[i] = wuerfel[i].liesPunktzahl();
        }
        dasSpiel.trageEin(figurenNummer, wA);
    }

    public void neuesSpielGeklickt() {
        dasSpiel.starteNeu();
    }

    public void geklicktWuerfeln(boolean[] wuerfelWerfen) {
        for (int i = 0; i < wuerfelWerfen.length; i++) {
            if (wuerfelWerfen[i]) {
                wuerfel[i].wirf();
            }
        }
    }
}
