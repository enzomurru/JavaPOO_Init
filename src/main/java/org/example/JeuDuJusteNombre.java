package org.example;
import java.util.Scanner;

public class JeuDuJusteNombre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Générer un nombre aléatoire entre 1 et 100
        int nombreADeviner = (int) (Math.random() * 100) + 1;

        // Initialiser le nombre de tentatives à 0
        int nbTentatives = 0;

        // Demander au joueur de deviner le nombre jusqu'à ce qu'il le trouve
        while (true) {
            System.out.print("Devinez le nombre (entre 1 et 100) : ");
            int nombrePropose = scanner.nextInt();
            nbTentatives++;

            if (nombrePropose < nombreADeviner) {
                System.out.println("Le nombre à deviner est plus grand.");
            } else if (nombrePropose > nombreADeviner) {
                System.out.println("Le nombre à deviner est plus petit.");
            } else {
                System.out.println("Bravo, vous avez trouvé le nombre en " + nbTentatives + " tentatives !");
                break;
            }
        }

        scanner.close();
    }
}
