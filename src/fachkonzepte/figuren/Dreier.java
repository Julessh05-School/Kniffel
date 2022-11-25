package fachkonzepte.figuren;

import fachkonzepte.Figur;

public class Dreier extends Figur {
    @Override
    public void trageEin(int[] pAugenzahl) {
        // nur 3er werden eingetragen

        for (int i : pAugenzahl) {
            if (i == 3) {
                punktzahl += i;
            }
        }
        istEingetragen = true;
    }
}
