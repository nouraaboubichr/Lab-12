/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author hp
 */

public class LogManager {

    private String logPath;
    private DateTimeFormatter dtf;

    public LogManager(String logPath) {
        this.logPath = logPath;
        this.dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    public void log(String level, String message) {

        String timestamp = LocalDateTime.now().format(dtf);

        try (PrintWriter pw = new PrintWriter(new FileWriter(logPath, true))) {
            pw.println(timestamp + " [" + level + "] " + message);

        } catch (IOException e) {
            System.err.println("Erreur de log : " + e.getMessage());
        }
    }
}
