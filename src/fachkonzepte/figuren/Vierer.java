package fachkonzepte.figuren;

import fachkonzepte.Figur;

public class Vierer extends Figur {
    @Override
    public void trageEin(int[] pAugenzahl) {
        // nur 4er werden eingetragen

        for (int i : pAugenzahl) {
            if (i == 4) {
                punktzahl += i;
            }
        }
        istEingetragen = true;
    }
}
