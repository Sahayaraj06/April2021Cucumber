package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {

	@Given("User wants to select a car {string} from uber app")
	public void user_wants_to_select_a_car_from_uber_app(String carType) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("step 1 : " + carType);
	}

	@When("User selects the car {string} and pickup point as {string}")
	public void user_selects_the_car_and_pickup_point_as(String carType, String pickupLocation) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step 2 : " + carType +" "+ pickupLocation);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step 3");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step 4");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step 5 : "+ price);
	}
}
