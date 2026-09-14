/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities1.LogManager;

/**
 *
 * @author hp
 */
public class MainLog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogManager logger = new LogManager("application.log");

        logger.log("INFO", "Demarrage de l'application");
        logger.log("DEBUG", "Chargement de la configuration");
        logger.log("ERROR", "Impossible de se connecter a la base");

        System.out.println("Journal ecrit dans application.log");
    }
    
}
