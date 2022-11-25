package fachkonzepte.figuren;

import fachkonzepte.Figur;

public class Dreierpasch extends Figur {
    @Override
    public void trageEin(int[] pAugenzahl) {
        // Augensumme wird nur eingetragen, wenn es mind. drei gleiche W�rfel gibt

        int[] wieOft = {0, 0, 0, 0, 0, 0};
        int summe = 0;

        for (int i : pAugenzahl) {
            int a = i - 1;
            wieOft[a]++;
            summe += i;
        }

        boolean dreiGleiche = false;

        for (int i : wieOft) {
            if (i >= 3) {
                dreiGleiche = true;
                break;
            }
        }

        if (dreiGleiche) {
            punktzahl = summe;
        }
        istEingetragen = true;
    }
}
