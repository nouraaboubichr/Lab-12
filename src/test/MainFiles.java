/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.CsvParser;
import entities.ObjectSerializer;
import entities.Record;
import entities.TextReader;
import entities.TextWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class MainFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Exercice 1 : lecture
            System.out.println("=== Lecture input.txt ===");
            TextReader.readLines("input.txt");

            // Exercice 2 : copie + resume
            System.out.println();
            System.out.println("=== Copie avec resume ===");
            TextWriter.copyWithSummary("input.txt", "output.txt");

            // Exercice 3 : CSV
            List<Record> all = CsvParser.readCsv("data.csv");

            List<Record> passed = new ArrayList<Record>();
            for (int i = 0; i < all.size(); i++) {
                Record r = all.get(i);
                if (r.getScore() >= 50) {
                    passed.add(r);
                }
            }

            CsvParser.writeCsv(passed, "passed.csv");

            // Exercice 4 : serialisation
            ObjectSerializer.serialize(all, "records.ser");
            List<Record> loaded = ObjectSerializer.deserialize("records.ser");

            System.out.println();
            System.out.println("=== Objets deserialises ===");
            for (int i = 0; i < loaded.size(); i++) {
                System.out.println(loaded.get(i));
            }

        } catch (IOException e) {
            System.err.println("Erreur d'E/S : " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.err.println("Erreur de deserialisation : " + e.getMessage());
        }
    }
    
}
