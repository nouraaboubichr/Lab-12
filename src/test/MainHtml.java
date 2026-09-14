/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities1.HtmlGenerator;

/**
 *
 * @author hp
 */
public class MainHtml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HtmlGenerator.writeHtml(
            "index.html",
            "Ma premiere page",
            "Bienvenue sur ma page generee par PrintWriter !"
        );

        System.out.println("Fichier index.html genere.");
    }
    
}
