package steuerung;

import benutzerschnittstelle.Benutzerschnittstelle;
import fachkonzepte.Bestenliste;
import fachkonzepte.Spiel;

public final class Steuerung {

    private final Benutzerschnittstelle dieBenutzerschnittstelle;
    private final Spiel dasSpiel;

    private final Bestenliste dieBestenliste;

    public Steuerung(Benutzerschnittstelle benutzerschnittstelle) {
        dieBenutzerschnittstelle = benutzerschnittstelle;
        dasSpiel = new Spiel();
        dieBestenliste = new Bestenliste();
    }

    public void geklicktEintragen(int figurNummer) {
    }

    public void neuesSpielGeklickt() {
    }

    public void geklicktWuerfeln(boolean[] wuerfelWerfen) {
    }
}
