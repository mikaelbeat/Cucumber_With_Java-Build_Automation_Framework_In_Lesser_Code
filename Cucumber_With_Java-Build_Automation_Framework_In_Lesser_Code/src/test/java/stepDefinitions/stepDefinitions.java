package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinitions {
	
	@Given("^Validate the browser$")
	public void validate_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("*** BACKGROUND - START ***");
		System.out.println("Validate the browser.");
	}

	@When("^Browser is triggered$")
	public void browser_is_triggered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Browser is triggered.");
	}

	@Then("^Check if browser is started$")
	public void check_if_browser_is_started() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Check if browser is started.");
		System.out.println("*** BACKGROUND - END ***\n");
	}

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        // Code to navigate to login url
    	System.out.println("Navigated to login page.");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_username_and_password(String username, String password) throws Throwable {
        // Code to login
    	System.out.println("Used username " + username);
    	System.out.println("Used password " + password);
    	System.out.println("Logged in to the application.");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        // Code to check home page is populated
    	System.out.println("Valitated home page.");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String condition) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Cards displayed are " + condition);
    	System.out.println("\n***************\n");
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    	List<List<String>>  obj = data.raw();
    	System.out.println("Used data table information " + obj.get(0).get(0));
    	System.out.println("Used data table information " + obj.get(0).get(1));
    	System.out.println("Used data table information " + obj.get(0).get(2));
    	System.out.println("Used data table information " + obj.get(0).get(3));
    	System.out.println("Used data table information " + obj.get(0).get(4));
    }
    
    @When("^User login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
        System.out.println("Used username " + username);
        System.out.println("Used password " + password);
    }

}