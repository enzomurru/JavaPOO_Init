package org.example;
import java.util.Scanner;

public class Pyramide {
    public static void main(String[] args) {

        //Code pour la pyramide-----------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un caractère : ");
        char caractere;
        caractere = scanner.next().charAt(0);
        System.out.print("Entrez le nombre de lignes : ");
        int nombreLignes = scanner.nextInt();
        int nombreCaracteres = 1;
        int nombreEspaces = nombreLignes - 1;
        for (int i = 0; i < nombreLignes; i++) {
        for (int j = 0; j < nombreEspaces; j++) {
        System.out.print(" ");
        }
        for (int j = 0; j < nombreCaracteres; j++) {
        System.out.print(caractere);
        }
        System.out.println();
        nombreCaracteres += 2;
        nombreEspaces--;
        }
        scanner.close();
        //--------------------------------------------------------------------------
    }
}
