package CommonMethods;

public class Search {

 public String displayProduct(Product product)
 {
	 if(product.getProductsList().contains(product.getProductname()))
			 {
		 		return product.getProductname();
			 }
	  return null;
 }
}
