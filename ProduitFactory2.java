package designPattern;

public class ProduitFactory2 extends ProduitFactory {

	  protected ProduitA createProduitA() {
	    return new ProduitA2();
	    // change to git
	  }
	}
