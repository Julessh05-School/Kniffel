package fachkonzepte.figuren;

import fachkonzepte.Figur;

public final class Chance extends Figur {
    @Override
    public void trageEin(int[] augenzahl) {
        for (int j : augenzahl) {
            punktzahl += j;
        }
        istEingetragen = true;
    }
}
