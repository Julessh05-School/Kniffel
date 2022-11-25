package fachkonzepte.figuren;

import fachkonzepte.Figur;

public class FullHouse extends Figur {
    @Override
    public void trageEin(int[] pAugenzahl) {
        // Punktzahl 25 wird eingetragen, wenn es drei und zwei oder f�nf gleiche W�rfel gibt

        int[] wieOft = {0, 0, 0, 0, 0, 0};

        for (int i : pAugenzahl) {
            int a = i - 1;
            wieOft[a]++;
        }

        boolean zweiGleiche = false;
        boolean dreiGleiche = false;
        boolean fuenfGleiche = false;

        for (int i : wieOft) {
            switch (i) {
                case 2 -> zweiGleiche = true;
                case 3 -> dreiGleiche = true;
                case 5 -> fuenfGleiche = true;
            }
        }

        if (dreiGleiche && zweiGleiche || fuenfGleiche) {
            punktzahl = 25;
        }
        istEingetragen = true;
    }
}
