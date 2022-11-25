package fachkonzepte;

public final class Endstand {
    private final String name;
    private final int punkte;


    public Endstand(String name, int punkte) {
        this.name = name;
        this.punkte = punkte;
    }

    public String liesName() {
        return name;
    }

    public int liesPunkte() {
        return punkte;
    }
}
