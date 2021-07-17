package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User is on Login page")
	public void user_is_in_Login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("inside step- User is on Login page");
		//throw new io.cucumber.java.PendingException();
	}

	@When("User enterer valid UserName and password")
	public void user_enterer_valid_UserName_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("inside step- User enterer valid UserName and password");
		//throw new io.cucumber.java.PendingException();
	}

	@And("Click on login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("inside step- Click on login button");
		//throw new io.cucumber.java.PendingException();
		
	}

	@Then("User navigate to the Home page")
	public void user_navigate_to_the_navigate_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("inside step- User navigate to the Home page");
		//throw new io.cucumber.java.PendingException();
	}

}
