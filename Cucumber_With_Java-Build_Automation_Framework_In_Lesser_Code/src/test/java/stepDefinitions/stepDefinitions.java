package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinitions {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        // Code to navigate to login url
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        // Code to login
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        // Code to check home page is populated
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        // Code to check that cards are displayed
    }

}