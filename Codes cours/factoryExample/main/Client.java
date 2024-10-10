package main;

import products.factory.ProduitFactory1;
import products.factory.ProduitFactory2;
import products.factory.ProduitFactory3;
import products.factory.ProduitA;
import products.factory.ProduitFactory;

public class Client{

    public static void main(String[] args) {
        
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();
        ProduitFactory produitFactory3 = new ProduitFactory3();

        ProduitA produitA = null;

        System.out.println("Utilisation de la premiere fabrique");
        produitA = produitFactory1.getProduitA();
        produitA.methodeA();

        System.out.println("Utilisation de la seconde fabrique");
        produitA = produitFactory2.getProduitA();
        produitA.methodeA();

        System.out.println("Utilisation de la troisieme fabrique");
        produitA = produitFactory3.getProduitA();
        produitA.methodeA();


    }
}
