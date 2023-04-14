package org.example;

public class SommeNb {
    public static void main(String[] args) {
        //Calcul Somme 10.000-------------------------------------------------------
        int somme = 0;
        for (int i = 1; i <= 10000; i++) {
        somme += i;
        }
        System.out.println("La somme des nombres jusqu'à 10 000 est : " + somme);
        //--------------------------------------------------------------------------
    }
}
