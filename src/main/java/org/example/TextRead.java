package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextRead {

    public static void main(String[] args) {
        // Saisir le chemin du fichier
        String chemin = "C:/Users/enzom/Desktop/Licence (IPI)/Init_Java/test_2.txt"; // remplacer par votre chemin

        // Ouvrir le fichier
        try (BufferedReader br = new BufferedReader(new FileReader(chemin))) {

            // Compter les mots dans le fichier
            int nbMots = 0;
            String ligne;
            while ((ligne = br.readLine()) != null) {
                String[] mots = ligne.split("\\s+");
                nbMots += mots.length;
            }

            // Afficher le résultat
            System.out.println("Le fichier contient " + nbMots + " mots.");

        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }

}
