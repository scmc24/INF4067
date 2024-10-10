package products.factory;

import products.ProduitA1;

public class ProduitFactory1 extends ProduitFactory{

    @Override
    protected ProduitA createProduitA() {
        return new ProduitA1();
        }
        
    
  
}
