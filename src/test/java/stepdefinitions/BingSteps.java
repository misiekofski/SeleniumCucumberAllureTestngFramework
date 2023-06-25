package stepdefinitions;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.fail;

public class BingSteps {
    @Given("User is on bing.com webpage")
    public void userIsOnBingComWebpage() {
        
        
    }

    @When("User searches for {string}")
    public void userSearchesFor(String arg0) {
        
    }

    @Then("First three results contains {string}")
    public void firstThreeResultsContains(String arg0) {
    }

    @Then("number {int} is less than {int}")
    public void numberIsLessThan(int arg0, int arg1) {
    }


    @Then("I want to fail my test")
    public void iWantToFailMyTest() {
        fail();
    }
}
