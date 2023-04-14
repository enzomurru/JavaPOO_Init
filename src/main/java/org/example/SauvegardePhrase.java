package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SauvegardePhrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir une phrase
        System.out.print("Entrez une phrase : ");
        String phrase = scanner.nextLine();

        // Demander à l'utilisateur de saisir le nom du fichier
        System.out.print("Entrez le nom du fichier : ");
        String nomFichier = scanner.nextLine() + ".txt";

        // Écrire la phrase dans le fichier
        try {
            FileWriter writer = new FileWriter(nomFichier);
            writer.write(phrase);
            writer.close();
            System.out.println("La phrase a été sauvegardée dans le fichier " + nomFichier);
        } catch (IOException e) {
            System.out.println("Erreur : impossible d'écrire dans le fichier.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
