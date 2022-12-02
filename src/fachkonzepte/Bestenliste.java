package fachkonzepte;

import speicher.BestenlisteSpeicher;

public final class Bestenliste {

    private final BestenlisteSpeicher speicher;

    public Bestenliste() {
        speicher = new BestenlisteSpeicher();
    }

    public Endstand[] liesAlleEnstaende() {
        return speicher.liesAlleEnstaendeAusSpeicher();
    }

    public void trageEndstandEin(Endstand endstand) {
        speicher.schreibeEndstandInSpeicher(endstand);
    }
}
