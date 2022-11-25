package fachkonzepte.figuren;

import fachkonzepte.Figur;

public class Kniffel extends Figur {
    @Override
    public void trageEin(int[] pAugenzahl) {
        // Punktzahl 50 wird nur eingetragen, wenn es f�nf gleiche W�rfel gibt

        int[] wieOft = {0, 0, 0, 0, 0, 0};

        for (int i : pAugenzahl) {
            int a = i - 1;
            wieOft[a]++;
        }

        boolean fuenfGleiche = false;

        for (int i : wieOft) {
            if (i == 5) {
                fuenfGleiche = true;
                break;
            }
        }

        if (fuenfGleiche) {
            punktzahl = 50;
        }
        istEingetragen = true;
    }
}
