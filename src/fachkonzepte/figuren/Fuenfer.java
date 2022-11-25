package fachkonzepte.figuren;

import fachkonzepte.Figur;

public class Fuenfer extends Figur {
    @Override
    public void trageEin(int[] pAugenzahl) {
        // nur 5er werden eingetragen

        for (int i : pAugenzahl) {
            if (i == 5) {
                punktzahl += i;
            }
        }
        istEingetragen = true;
    }
}
