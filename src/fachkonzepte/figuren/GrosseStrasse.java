package fachkonzepte.figuren;

import fachkonzepte.Figur;

public class GrosseStrasse extends Figur {
    @Override
    public void trageEin(int[] pAugenzahl) {
        // Augensumme 40 wird eingetragen, wenn es f�nf W�rfel mit
        // aufeinanderfolgenden Augenzahlen gibt

        boolean einsVorhanden = false;
        boolean zweiVorhanden = false;
        boolean dreiVorhanden = false;
        boolean vierVorhanden = false;
        boolean fuenfVorhanden = false;
        boolean sechsVorhanden = false;

        for (int i : pAugenzahl) {
            switch (i) {
                case 1 -> einsVorhanden = true;
                case 2 -> zweiVorhanden = true;
                case 3 -> dreiVorhanden = true;
                case 4 -> vierVorhanden = true;
                case 5 -> fuenfVorhanden = true;
                case 6 -> sechsVorhanden = true;
            }
        }

        if (einsVorhanden && zweiVorhanden && dreiVorhanden && vierVorhanden && fuenfVorhanden ||
                zweiVorhanden && dreiVorhanden && vierVorhanden && fuenfVorhanden && sechsVorhanden) {
            punktzahl = 40;
        }

        istEingetragen = true;
    }
}
