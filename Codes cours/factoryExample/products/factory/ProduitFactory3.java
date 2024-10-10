package products.factory;

import products.ProduitA3;

public class ProduitFactory3  extends ProduitFactory{

    @Override
    protected ProduitA createProduitA() {
        return new ProduitA3();
          }
    
}
