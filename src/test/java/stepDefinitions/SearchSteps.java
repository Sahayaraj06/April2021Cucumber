package stepDefinitions;

import CommonMethods.Product;
import CommonMethods.Search;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	Product product;
	Search search;
	
	@Given("I have a search field on amazon page")
	public void i_have_a_search_field_on_amazon_page()
	{
		System.out.println("Step 1 :I have a search field on amazon page");
	}

	@When("^I search for a product \"([^\"]+)\" and price (\\d+)$")
	public void search_for_Product(String productname, int price)
	{
		System.out.println("Step 2 :The Product name is: "+ productname + " and price is: "+ price );
		product = new Product(productname, price);
		
	}
	
	@Then("Product {string} should be displayed")
	public void product_Display(String productname)
	{
		System.out.println("Step 3 :The product: "+productname+" should be displayed");
		search =  new Search();
		String name = search.displayProduct(product);
		System.out.println(name);
		
		
	}
}
