package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegSteps {


	@Given("user is in registration page")
	public void user_is_in_registration_page() {
	  System.out.println(" user is on registration page");
	}
	
	@When("user enter the following details")
	public void user_enter_the_following_details(DataTable dataTable) {
	  List<List<String>> userList = dataTable.asLists(String.class);
	  for(List<String> e : userList)
	  {
		  System.out.println(e);
	  }
	}
	
	@When("user enter the following details with columns")
	public void user_enter_the_following_details_with_columns(DataTable dataTable) {
	   
		List<Map<String, String>> userList = dataTable.asMaps(String.class,String.class);
		//System.out.println(userList.get(0).get("Name"));
		for(Map<String, String> e : userList)
		{
			System.out.println(e.get("Name"));
			System.out.println(e.get("Email"));
			System.out.println(e.get("Ph:No"));
			System.out.println(e.get("city"));
		}
	 
	}
	@Then("user registration should be sucessfull")
	public void user_registration_should_be_sucessfull() {
	    System.out.println("user should be register sucessfully");
	}
}
