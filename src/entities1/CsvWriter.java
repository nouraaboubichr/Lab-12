/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
/**
 *
 * @author hp
 */

public class CsvWriter {

    public static void writeCsv(String path, List<String> header, List<String[]> rows) {

        try (PrintWriter pw = new PrintWriter(path)) {

            pw.println(joindre(header));

            for (int i = 0; i < rows.size(); i++) {
                String[] row = rows.get(i);
                pw.println(joindre(row));
            }

        } catch (FileNotFoundException e) {
            System.err.println("Impossible d'ecrire le CSV : " + e.getMessage());
        }
    }

    private static String joindre(List<String> valeurs) {

        String resultat = "";

        for (int i = 0; i < valeurs.size(); i++) {
            if (i > 0) {
                resultat = resultat + ",";
            }
            resultat = resultat + valeurs.get(i);
        }

        return resultat;
    }

    private static String joindre(String[] valeurs) {

        String resultat = "";

        for (int i = 0; i < valeurs.length; i++) {
            if (i > 0) {
                resultat = resultat + ",";
            }
            resultat = resultat + valeurs[i];
        }

        return resultat;
    }
}
