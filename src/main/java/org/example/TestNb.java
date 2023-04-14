package org.example;
import java.util.Scanner;

public class TestNb {
    public static void main(String[] args) {

        //Nombre Pair, Impair, Premier----------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();

        //Vérifier si le nombre est pair ou impair
        if (nombre % 2 == 0) {
        System.out.println(nombre + " est un nombre pair.");
        } else {
        System.out.println(nombre + " est un nombre impair.");
        }

        //Vérifier si le nombre est premier
        boolean estPremier = true;
        for (int i = 2; i <= nombre / 2; i++) {
        if (nombre % i == 0) {
        estPremier = false;
        break;
        }
        }

        if (estPremier) {
        System.out.println(nombre + " est un nombre premier.");
        } else {
        System.out.println(nombre + " n'est pas un nombre premier.");
        }

        scanner.close();
        //--------------------------------------------------------------------------
    }
}
