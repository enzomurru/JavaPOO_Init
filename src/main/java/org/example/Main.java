package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Création de mon rectangle
        Rectangle monRectangle = new Rectangle(5.0, 3.0);

        //Affichage de mon rectangle
        System.out.println("Mon rectangle est : ");
        monRectangle.afficherRectangle();
        System.out.println("");

        //Création de mon Carré
        Square monCarre = new Square(8.0);

        //Affichage de mon Carré
        double surface = monCarre.calculerSurface();
        System.out.println("Mon carré est : ");
        monCarre.afficherRectangle();
        System.out.println("et sa surface mesure : " + surface);
    }
}