package products;

import products.factory.ProduitA;

public class ProduitA3 extends ProduitA {

    @Override
    public void methodeA() {
        System.out.println("je suis un produit de type A3");
        System.out.println("ProduitA3.methodeA()");
    }
    
}
