package speicher;

import fachkonzepte.Endstand;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public final class BestenlisteSpeicher {

    public Endstand[] liesAlleEnstaendeAusSpeicher() {
        final BufferedReader reader;
        final Endstand[] errorArray = new Endstand[0];
        try {
            reader = new BufferedReader(new FileReader(""));
        } catch (FileNotFoundException e) {
            return errorArray;
        }
        String zeile;
        try {
            while ((zeile = reader.readLine()) != null) {
                try {
                    if (((zeile = reader.readLine()) != null)) {

                    }
                } catch (IOException e) {
                    return errorArray;
                }

            }
        } catch (IOException ignored) {
        }
        return errorArray;
    }

    public void schreibeEndstandInSpeicher(Endstand endstand) {

    }
}
