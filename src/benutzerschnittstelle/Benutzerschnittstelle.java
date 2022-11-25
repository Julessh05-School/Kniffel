package benutzerschnittstelle;

import steuerung.Steuerung;

public final class Benutzerschnittstelle {

    private final Steuerung dieSteuerung;

    public Benutzerschnittstelle() {
        dieSteuerung = new Steuerung(this);
    }
}
