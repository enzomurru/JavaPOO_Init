package org.example;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {

        //Inversion d'une chaine de caractère---------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = scanner.nextLine();
        String motInverse = "";
        for (int i = mot.length() - 1; i >= 0; i--) {
        motInverse += mot.charAt(i);
        }
        System.out.println("Le mot inversé est : " + motInverse);
        scanner.close();
        //--------------------------------------------------------------------------
    }
}
