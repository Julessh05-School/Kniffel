package fachkonzepte;

public final class Wuerfel {
    private static int anzahlVersucheAktFigur = 0;
    private int augenzahl;

    public Wuerfel() {
    }

    public static boolean darfNochmalWuerfelnAktFigur() {
        return anzahlVersucheAktFigur < 3;
    }

    public static void geworfen() {
        anzahlVersucheAktFigur++;
    }

    public static void starteNeueFigur() {
        anzahlVersucheAktFigur = 0;
    }

    public int liesPunktzahl() {
        return augenzahl;
    }

    public void wirf() {
        if (darfNochmalWuerfelnAktFigur()) {
            augenzahl = (int) (Math.random() * 6);
        }
    }
}
