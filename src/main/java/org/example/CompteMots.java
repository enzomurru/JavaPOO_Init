package org.example;
import java.util.Scanner;

public class CompteMots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir une phrase
        System.out.print("Entrez une phrase : ");
        String phrase = scanner.nextLine();

        // Compter le nombre de mots dans la phrase
        int nbMots = phrase.split(" ").length;

        // Afficher le nombre de mots
        System.out.println("La phrase contient " + nbMots + " mots.");

        scanner.close();
    }
}
