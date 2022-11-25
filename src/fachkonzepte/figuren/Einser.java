package fachkonzepte.figuren;

import fachkonzepte.Figur;

public final class Einser extends Figur {
    @Override
    public void trageEin(int[] augenzahl) {
        for (int i : augenzahl) {
            if (i == 1) {
                punktzahl += i;
            }
        }
        istEingetragen = true;
    }
}
