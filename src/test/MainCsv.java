/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities1.CsvWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class MainCsv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> header = new ArrayList<String>();
        header.add("id");
        header.add("nom");
        header.add("score");

        List<String[]> rows = new ArrayList<String[]>();
        rows.add(new String[]{"1", "Alice", "85"});
        rows.add(new String[]{"2", "Bob", "92"});
        rows.add(new String[]{"3", "Carol", "78"});

        CsvWriter.writeCsv("report.csv", header, rows);

        System.out.println("Fichier report.csv genere.");
    }
    
}
