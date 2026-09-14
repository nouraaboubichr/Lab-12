/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hp
 */

public class CsvParser {

    public static List<Record> readCsv(String path) throws IOException {

        List<Record> records = new ArrayList<Record>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line;
            boolean premiereLigne = true;

            while ((line = br.readLine()) != null) {

                // ignorer l'en-tete "id,name,score"
                if (premiereLigne) {
                    premiereLigne = false;
                    continue;
                }

                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                double score = Double.parseDouble(parts[2].trim());

                records.add(new Record(id, name, score));
            }
        }

        return records;
    }

    public static void writeCsv(List<Record> records, String path) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            bw.write("id,name,score");
            bw.newLine();

            for (int i = 0; i < records.size(); i++) {

                Record r = records.get(i);
                bw.write(r.getId() + "," + r.getName() + "," + r.getScore());
                bw.newLine();
            }
        }
    }
}