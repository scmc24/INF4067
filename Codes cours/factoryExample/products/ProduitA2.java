package products;

import products.factory.ProduitA;

public class ProduitA2 extends ProduitA{

    @Override
    public void methodeA() {
       System.out.println("je suis un produit de type A2");
       System.out.println("ProduitA2.mrthodeA()");
    }
    
}
