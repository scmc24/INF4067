package products.factory;

// fabrique abstraite ---------------------

public abstract class ProduitFactory {

    public ProduitA getProduitA(){
        return createProduitA();
    }

    protected abstract ProduitA createProduitA();
}