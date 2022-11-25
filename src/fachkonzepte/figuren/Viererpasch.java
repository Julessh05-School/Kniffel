package fachkonzepte.figuren;

import fachkonzepte.Figur;

public class Viererpasch extends Figur {
    @Override
    public void trageEin(int[] pAugenzahl) {
        // Augensumme wird nur eingetragen, wenn es mind. vier gleiche W�rfel gibt

        int[] wieOft = {0, 0, 0, 0, 0, 0};
        int summe = 0;

        for (int i : pAugenzahl) {
            int a = i - 1;
            wieOft[a]++;
            summe += i;
        }

        boolean vierGleiche = false;

        for (int i : wieOft) {
            if (i >= 4) {
                vierGleiche = true;
                break;
            }
        }

        if (vierGleiche) {
            punktzahl = summe;
        }
        istEingetragen = true;
    }
}
