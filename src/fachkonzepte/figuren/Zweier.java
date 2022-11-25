package fachkonzepte.figuren;

import fachkonzepte.Figur;

public class Zweier extends Figur {
    @Override
    public void trageEin(int[] pAugenzahl) {
        // nur 2er werden eingetragen

        for (int i : pAugenzahl) {
            if (i == 2) {
                punktzahl += i;
            }
        }
        istEingetragen = true;
    }
}
