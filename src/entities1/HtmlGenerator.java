/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities1;

import java.io.PrintWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;

/**
 *
 * @author hp
 */

public class HtmlGenerator {

    public static void writeHtml(String path, String pageTitle, String bodyText) {

        try (PrintWriter pw = new PrintWriter(path, "UTF-8")) {

            pw.println("<!DOCTYPE html>");
            pw.println("<html lang=\"fr\">");
            pw.println("<head>");
            pw.println("  <meta charset=\"UTF-8\">");
            pw.println("  <title>" + pageTitle + "</title>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("  <h1>" + pageTitle + "</h1>");
            pw.println("  <p>" + bodyText + "</p>");
            pw.println("</body>");
            pw.println("</html>");

        } catch (FileNotFoundException e) {
            System.err.println("Erreur lors de la generation HTML : " + e.getMessage());

        } catch (UnsupportedEncodingException e) {
            System.err.println("Encodage non supporte : " + e.getMessage());
        }
    }
}