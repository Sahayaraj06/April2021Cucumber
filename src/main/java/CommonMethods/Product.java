package CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class Product {
	String productname;
	int price;
	public Product(String productname, int price) {
		this.productname = productname;
		this.price = price;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getProductsList()
	{
		List<String> productsList = new ArrayList<>();
		productsList.add("Apple Macbook Pro");
		productsList.add("Apple watch");
		productsList.add("samsung");
		return productsList;
	}
	
}
