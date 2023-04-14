package org.example;

public class Rectangle {
    private double longueur;
    private double largeur;

    // Constructeur
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Méthode pour calculer la surface du rectangle
    public double calculerSurface() {
        return longueur * largeur;
    }

    // Méthode pour afficher le rectangle
    public void afficherRectangle() {
        for (int i = 0; i < largeur; i++) {
            for (int j = 0; j < longueur; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
