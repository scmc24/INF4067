package products.factory;

import products.ProduitA2;

public class ProduitFactory2 extends ProduitFactory{

    @Override
    protected ProduitA createProduitA() {
        return new ProduitA2();
        }
    
}
