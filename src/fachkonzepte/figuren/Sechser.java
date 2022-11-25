package fachkonzepte.figuren;

import fachkonzepte.Figur;

public class Sechser extends Figur {
    @Override
    public void trageEin(int[] pAugenzahl) {
        // nur 6er werden eingetragen

        for (int i : pAugenzahl) {
            if (i == 6) {
                punktzahl += i;
            }
        }
        istEingetragen = true;
    }
}
